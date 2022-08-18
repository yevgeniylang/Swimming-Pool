package by.example.swimming_pool.boundary.databases.postgre.exception;

public class ResultNotAllowedException extends RuntimeException {
    public ResultNotAllowedException(){
        super("Format not allowed, please make it as 'xx.xx,xx'");
    }
}
