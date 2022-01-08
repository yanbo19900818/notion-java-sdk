package xyz.yanbo.notion.sdk.model.property;

import lombok.Data;

import java.util.List;

@Data
public class NotionProperty {
    private String id;
    private NotionPropertyTypeEnum type;
    private String name;
    private NotionFormulaProperty formula;
    private NotionRelationProperty relation;
    private NotionSelectProperty select;
    private NotionNumberProperty number;
    private NotionMultiSelectProperty multiSelect;
    private NotionRollupProperty rollup;

    public enum NotionPropertyTypeEnum {
        TITLE("title"), RICH_TEXT("rich_text"), NUMBER("number"), SELECT("select"), MULTI_SELECT("multi_select"), DATE("date"), PEOPLE("people"), FILES("files"), CHECKBOX("checkbox"), URL("url"), EMAIL("email"), PHONE_NUMBER("phone_number"), FORMULA("formula"), RELATION("relation"), ROLLUP("rollup"), CREATED_TIME("created_time"), CREATED_BY("created_by"), LAST_EDITED_TIME("last_edited_time"), LAST_EDITED_BY("last_edited_by"),
        ;
        private String code;

        NotionPropertyTypeEnum(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }

        public static NotionPropertyTypeEnum getEnumByCode(String code) {
            for (NotionPropertyTypeEnum value : values()) {
                if (value.getCode().equals(code)) {
                    return value;
                }
            }
            return null;
        }
    }

    @Data
    public class NotionFormulaProperty {
        /**
         * Formula to evaluate for this property. You can read more about the syntax for formulas in the help center
         */
        private String expression;
    }

    @Data
    public class NotionRelationProperty {
        /**
         * The database this relation refers to. New linked pages must belong to this database in order to be valid.
         * e.g.:"668d797c-76fa-4934-9b05-ad288df2d136"
         */
        private String databaseId;
        /**
         * By default, relations are formed as two synced properties across databases: if you make a change to one property, it updates the synced property at the same time. synced_property_name refers to the name of the property in the related database.
         * e.g.:"Ingredients"
         */
        private String syncedPropertyName;
        /**
         * By default, relations are formed as two synced properties across databases: if you make a change to one property, it updates the synced property at the same time. synced_property_id refers to the id of the property in the related database. This is usually a short string of random letters and symbols.
         * e.g.:"fy:{"
         */
        private String syncedPropertyId;
    }

    @Data
    public class NotionSelectProperty {
        private List<NotionSelectOption> options;
    }

    @Data
    public class NotionNumberProperty {
        private PropertyNumberFormatEnum format;

    }

    public enum PropertyNumberFormatEnum {
        NUMBER("number"), NUMBER_WITH_COMMAS("number_with_commas"), PERCENT("percent"), DOLLAR("dollar"), CANADIAN_DOLLAR("canadian_dollar"), EURO("euro"), POUND("pound"), YEN("yen"), RUBLE("ruble"), RUPEE("rupee"), WON("won"), YUAN("yuan"), REAL("real"), LIRA("lira"), RUPIAH("rupiah"), FRANC("franc"), HONG_KONG_DOLLAR("hong_kong_dollar"), NEW_ZEALAND_DOLLAR("new_zealand_dollar"), KRONA("krona"), NORWEGIAN_KRONE("norwegian_krone"), MEXICAN_PESO("mexican_peso"), RAND("rand"), NEW_TAIWAN_DOLLAR("new_taiwan_dollar"), DANISH_KRONE("danish_krone"), ZLOTY("zloty"), BAHT("baht"), FORINT("forint"), KORUNA("koruna"), SHEKEL("shekel"), CHILEAN_PESO("chilean_peso"), PHILIPPINE_PESO("philippine_peso"), DIRHAM("dirham"), COLOMBIAN_PESO("colombian_peso"), RIYAL("riyal"), RINGGIT("ringgit"), LEU("leu"), ARGENTINE_PESO("argentine_peso"), URUGUAYAN_PESO("uruguayan_peso"),
        ;
        private String code;

        PropertyNumberFormatEnum(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }
    }

    @Data
    public class NotionMultiSelectProperty {
        private List<NotionMultiSelectOption> options;
    }

    @Data
    public class NotionRollupProperty {
        /**
         * The name of the relation property this property is responsible for rolling up.
         * e.g.:"Meals"
         */
        private String relationPropertyName;
        /**
         * The id of the relation property this property is responsible for rolling up.
         * e.g.:"fy:{"
         */
        private String relationPropertyId;
        /**
         * The name of the property of the pages in the related database that is used as an input to function.
         */
        private String rollupPropertyName;
        /**
         * The id of the property of the pages in the related database that is used as an input to function.
         */
        private String rollupPropertyId;
        /**
         * The function that is evaluated for every page in the relation of the rollup.
         */
        private String function;
    }

    public enum NotionFunctionEnum {
        COUNT_ALL("count_all"), COUNT_VALUES("count_values"), COUNT_UNIQUE_VALUES("count_unique_values"), COUNT_EMPTY("count_empty"), COUNT_NOT_EMPTY("count_not_empty"), PERCENT_EMPTY("percent_empty"), PERCENT_NOT_EMPTY("percent_not_empty"), SUM("sum"), AVERAGE("average"), MEDIAN("median"), MIN("min"), MAX("max"), RANGE("range"), SHOW_ORIGINAL("show_original");
        private String code;

        NotionFunctionEnum(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }

    }
}
