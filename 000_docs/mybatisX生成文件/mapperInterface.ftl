package ${mapperInterface.packageName};

import ${tableClass.fullClassName};

import java.util.List;
import java.util.Map;

/**
 * 针对表【${tableClass.tableName}<#if tableClass.remark?has_content>(${tableClass.remark!})</#if>】的数据库操作Mapper
 *
 * @author generator
 * @version 0.0.1
 * @date ${.now?string('yyyy-MM-dd HH:mm:ss')}
 */
public interface ${mapperInterface.fileName} {

    int insert(${tableClass.shortClassName} record);

    int insertSelective(${tableClass.shortClassName} record);

    ${tableClass.shortClassName} selectByPrimaryKey(Long id);

    List<${tableClass.shortClassName}> selectList(Map<String, Object> conditions);

    int updateByPrimaryKeySelective(${tableClass.shortClassName} record);

    int updateByPrimaryKey(${tableClass.shortClassName} record);
}
