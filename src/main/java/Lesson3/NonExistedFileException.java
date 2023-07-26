package Lesson3;

import java.io.IOException;

/**
 * Задание 3.3
 * Создайте класс исключения, которое будет возникать при попытке открыть несуществующий файл.
 * Исключение должно отображать понятное для пользователя сообщение об ошибке.
 */
public class NonExistedFileException extends IOException {
    public NonExistedFileException() {
        super("Файл не найден.... ");
    }
}


