package DL;

public enum Priority {
    LOW, MEDIUM, HIGH;

    public static Priority get(String value){
        try {
            return Priority.valueOf(value);
        }catch (IllegalArgumentException e){
            return Priority.LOW;
        }
    }
}
