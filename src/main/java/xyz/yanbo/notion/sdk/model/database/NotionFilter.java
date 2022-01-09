package xyz.yanbo.notion.sdk.model.database;

import lombok.Data;

@Data
public class NotionFilter {
    /**
     * The name or ID of the property to filter on.
     * e.g.:"Due date"
     */
    private String property;
    private NotionTextFilter text;
    private NotionNumberFilter number;
    private NotionCheckboxFilter checkbox;
    private NotionMultiSelectFilter multiSelect;
    private NotionSelectFilter select;
    private NotionDateFilter date;
    private NotionPeopleFilter people;
    private NotionFilesFilter files;
    private NotionRelationFilter relation;
    private NotionFormulaFilter formula;

    @Data
    public class NotionFormulaFilter {
        /**
         * Only return pages where the result type of the page property formula is "text" and the provided text filter condition matches the formula's value.
         */
        private NotionTextFilter text;
        /**
         * Only return pages where the result type of the page property formula is "checkbox" and the provided checkbox filter condition matches the formula's value.
         */
        private NotionCheckboxFilter checkbox;
        /**
         * Only return pages where the result type of the page property formula is "number" and the provided number filter condition matches the formula's value.
         */
        private NotionNumberFilter number;
        /**
         * Only return pages where the result type of the page property formula is "date" and the provided date filter condition matches the formula's value.
         */
        private NotionDateFilter date;
    }

    @Data
    public class NotionRelationFilter {
        /**
         * Only return pages where the page property value contains the provided value.
         * e.g.:"6c574cee-ca68-41c8-86e0-1b9e992689fb"
         */
        private String contains;
        /**
         * Only return pages where the page property value does not contain the provided value.
         * e.g.:"6c574cee-ca68-41c8-86e0-1b9e992689fb"
         */
        private String doesNotContain;
        /**
         * Only return pages where the page property value is empty.
         * only :true
         */
        private boolean isEmpty;
        /**
         * Only return pages where the page property value is present.
         * e.g.:true
         */
        private boolean isNotEmpty;
    }

    @Data
    public class NotionFilesFilter {
        /**
         * Only return pages where the page property value is empty.
         * only :true
         */
        private boolean isEmpty;
        /**
         * Only return pages where the page property value is present.
         * e.g.:true
         */
        private boolean isNotEmpty;
    }

    @Data
    public class NotionPeopleFilter {
        /**
         * Only return pages where the page property value contains the provided value.
         * e.g.:"6c574cee-ca68-41c8-86e0-1b9e992689fb"
         */
        private String contains;
        /**
         * Only return pages where the page property value does not contain the provided value.
         * e.g.:"6c574cee-ca68-41c8-86e0-1b9e992689fb"
         */
        private String doesNotContain;
        /**
         * Only return pages where the page property value is empty.
         * only :true
         */
        private boolean isEmpty;
        /**
         * Only return pages where the page property value is present.
         * e.g.:true
         */
        private boolean isNotEmpty;
    }

    @Data
    public class NotionDateFilter {
        /**
         * Only return pages where the page property value matches the provided date exactly.
         * <p>
         * If a date is provided, the comparison is done against the start and end of the UTC date.
         * <p>
         * If a date with a time is provided, the comparison is done with millisecond precision.
         * <p>
         * Note that if no timezone is provided, the default is UTC.
         * e.g.:"2021-05-10" or "2021-05-10T12:00:00" or "2021-10-15T12:00:00-07:00"
         */
        private String equals;
        /**
         * Only return pages where the page property value is before the provided date.
         * <p>
         * If a date with a time is provided, the comparison is done with millisecond precision.
         * <p>
         * Note that if no timezone is provided, the default is UTC.
         */
        private String before;
        /**
         * Only return pages where the page property value is after the provided date.
         * <p>
         * If a date with a time is provided, the comparison is done with millisecond precision.
         * <p>
         * Note that if no timezone is provided, the default is UTC.
         */
        private String after;
        /**
         * Only return pages where the page property value is on or before the provided date.
         * <p>
         * If a date with a time is provided, the comparison is done with millisecond precision.
         * <p>
         * Note that if no timezone is provided, the default is UTC.
         */
        private String onOrBefore;
        /**
         * Only return pages where the page property value is on or after the provided date.
         * <p>
         * If a date with a time is provided, the comparison is done with millisecond precision.
         * <p>
         * Note that if no timezone is provided, the default is UTC.
         */
        private String onOrAfter;
        /**
         * Only return pages where the page property value is empty.
         * only :true
         */
        private boolean isEmpty;
        /**
         * Only return pages where the page property value is present.
         * e.g.:true
         */
        private boolean isNotEmpty;
        //TODO this condition need handle
        //past_week	object (empty)	Only return pages where the page property value is within the past week.	{}
        //past_month	object (empty)	Only return pages where the page property value is within the past month.	{}
        //past_year	object (empty)	Only return pages where the page property value is within the past year.	{}
        //next_week	object (empty)	Only return pages where the page property value is within the next week.	{}
        //next_month	object (empty)	Only return pages where the page property value is within the next month.	{}
        //next_year	object (empty)	Only return pages where the page property value is within the next year.	{}

    }

    @Data
    public class NotionMultiSelectFilter {
        /**
         * Only return pages where the page property value contains the provided value.
         * e.g.:"Bridge"
         */
        private String contains;
        /**
         * Only return pages where the page property value does not contain the provided value.
         * e.g.:"Park"
         */
        private String doesNotContain;
        /**
         * Only return pages where the page property value is empty.
         * only :true
         */
        private boolean isEmpty;
        /**
         * Only return pages where the page property value is present.
         * e.g.:true
         */
        private boolean isNotEmpty;
    }

    @Data
    public class NotionSelectFilter {
        private String equals;
        private String doesNotEqual;
        /**
         * Only return pages where the page property value is empty.
         * only :true
         */
        private boolean isEmpty;
        /**
         * Only return pages where the page property value is present.
         * e.g.:true
         */
        private boolean isNotEmpty;
    }

    @Data
    public class NotionCheckboxFilter {
        private boolean equals;
        private boolean doesNotEqual;

    }

    @Data
    public class NotionNumberFilter {
        private Number equals;
        private Number doesNotEqual;
        private Number greaterThan;
        private Number lessThan;
        private Number greaterThanOrEqualTo;
        private Number lessThanOrEqualTo;
        /**
         * Only return pages where the page property value is empty.
         * only :true
         */
        private boolean isEmpty;
        /**
         * Only return pages where the page property value is present.
         * e.g.:true
         */
        private boolean isNotEmpty;
    }

    @Data
    public class NotionTextFilter {
        /**
         * Only return pages where the page property value matches the provided value exactly.
         * e.g.:"Golden Gate Bridge"
         */
        private String equals;
        /**
         * Only return pages where the page property value does not match the provided value exactly.
         * e.g.:"Golden Gate Bridge"
         */
        private String doesNotEqual;
        /**
         * Only return pages where the page property value contains the provided value.
         * e.g.:"Bridge"
         */
        private String contains;
        /**
         * Only return pages where the page property value does not contain the provided value.
         * e.g.:"Park"
         */
        private String doesNotContain;
        /**
         * Only return pages where the page property value starts with the provided value.
         * e.g.:"Golden Gate"
         */
        private String startsWith;
        /**
         * Only return pages where the page property value ends with the provided value.
         * e.g.:"Bridge"
         */
        private String endsWith;
        /**
         * Only return pages where the page property value is empty.
         * only :true
         */
        private boolean isEmpty;
        /**
         * Only return pages where the page property value is present.
         * e.g.:true
         */
        private boolean isNotEmpty;
    }
}

