package ${domain.packageName};

import lombok.Data;

import java.io.Serializable;<#list tableClass.importList as fieldType>${"\n"}import ${fieldType};</#list>

/**
 * ${tableClass.remark!}
 *
 * @author generator
 * @version 0.0.1
 * @date ${.now?string('yyyy-MM-dd HH:mm:ss')}
 */
@Data
public class ${tableClass.shortClassName} implements Serializable {

    private static final long serialVersionUID = 1L;

<#list tableClass.allFields as field>
    /**
     * ${field.remark!}
     */
    private ${field.shortTypeName} ${field.fieldName};
</#list>
}
