package DL;

public enum Status {
    DONE, IN_PROGRESS, REJECTED, NEW;

    public static Status get(String value){
        try {
            return Status.valueOf(value);
        }catch (IllegalArgumentException e){
            return Status.NEW;
        }
    }
}
// реализовать метод, который получает название enum
// если такого enum нет, то вернуть NEW

