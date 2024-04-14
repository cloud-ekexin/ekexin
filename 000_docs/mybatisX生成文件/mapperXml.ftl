<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="${mapperInterface.packageName}.${baseInfo.fileName}">

    <resultMap id="BaseResultMap" type="${tableClass.fullClassName}">
        <#list tableClass.pkFields as field>
            <id property="${field.fieldName}" column="${field.columnName}" jdbcType="${field.jdbcType}"/>
        </#list>
        <#list tableClass.baseFields as field>
            <result property="${field.fieldName}" column="${field.columnName}" jdbcType="${field.jdbcType}"/>
        </#list>
    </resultMap>

    <sql id="Base_Column_List">
        <#list tableClass.allFields as field>${field.columnName}<#sep>,<#if field_index%3==2>${"\n        "}</#if></#list>
    </sql>

    <select id="selectByPrimaryKey" parameterType="java.lang.Long" resultMap="BaseResultMap">
        SELECT
        <include refid="Base_Column_List"/>
        FROM ${tableClass.tableName}
        WHERE <#list tableClass.pkFields as field>${field.columnName} = ${'#'}{${field.fieldName}} <#if field_has_next>AND</#if></#list>
    </select>

    <select id="selectList" parameterType="java.util.Map" resultMap="BaseResultMap">
        SELECT
        <include refid="Base_Column_List"/>
        FROM ${tableClass.tableName}
        <where>
            <#list tableClass.allFields as field>
                <if test="${field.fieldName} != null">${'#'}{${field.fieldName}},</if>
            </#list>
        </where>
        <if test="sortString != null">ORDER BY ${'#'}${'{'}${'sortString}'}, id</if>
    </select>

    <insert id="insert"<#if (tableClass.pkFields?size==1)> keyColumn="${tableClass.pkFields[0].columnName}" keyProperty="${tableClass.pkFields[0].fieldName}" parameterType="${tableClass.fullClassName}" useGeneratedKeys="true"</#if>>
        INSERT INTO ${tableClass.tableName}
        ( <#list tableClass.allFields as field>${field.columnName}<#if field_index%3==2>${"\n        "}</#if><#sep>,</#list>
        )
        VALUES
        (<#list tableClass.allFields as field>${'#'}{${field.fieldName}}<#if field_index%3==2>${"\n        "}</#if><#sep>,</#list>
        )
    </insert>

    <insert id="insertSelective"<#if (tableClass.pkFields?size==1)> keyColumn="${tableClass.pkFields[0].columnName}" keyProperty="${tableClass.pkFields[0].fieldName}" parameterType="${tableClass.fullClassName}" useGeneratedKeys="true"</#if>>
        INSERT INTO ${tableClass.tableName}
        <trim prefix="(" suffix=")" suffixOverrides=",">
            <#list tableClass.allFields as field>
                <if test="${field.fieldName} != null">${field.columnName},</if>
            </#list>
        </trim>
        <trim prefix="values (" suffix=")" suffixOverrides=",">
            <#list tableClass.allFields as field>
                <if test="${field.fieldName} != null">${'#'}{${field.fieldName}},</if>
            </#list>
        </trim>
    </insert>

    <update id="updateByPrimaryKeySelective" parameterType="${tableClass.fullClassName}">
        UPDATE ${tableClass.tableName}
        <set>
            <#list tableClass.baseBlobFields as field>
                <if test="${field.fieldName} != null">${field.columnName} = ${'#'}{${field.fieldName}},</if>
            </#list>
        </set>
        WHERE <#list tableClass.pkFields as field>${field.columnName} = ${'#'}{${field.fieldName}} <#if field_has_next>AND</#if></#list>
    </update>

    <update id="updateByPrimaryKey" parameterType="${tableClass.fullClassName}">
        UPDATE ${tableClass.tableName}
        SET <#list tableClass.baseBlobFields as field>
            ${field.columnName} = ${'#'}{${field.fieldName}}<#sep>,</#list>
        WHERE <#list tableClass.pkFields as field>${field.columnName} = ${'#'}{${field.fieldName}} <#if field_has_next>AND</#if></#list>
    </update>
</mapper>
