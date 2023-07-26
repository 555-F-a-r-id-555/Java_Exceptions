package Lesson3;

import java.io.IOException;

/**
 * Создайте класс Счетчик, у которого есть метод add(), увеличивающий значение
 * внутренней int переменной на 1. Сделайте так, чтобы с объектом такого типа
 * можно было работать в блоке try-with-resources. Подумайте, что должно происходить
 * при закрытии этого ресурса? Напишите метод для проверки, закрыт ли ресурс.
 * При попытке вызвать add() у закрытого ресурса, должен выброситься IOException
 */
public class Counter implements AutoCloseable {
    private int count;
    private boolean isNotClosed;

    public Counter() {
        this.count = 0;
        this.isNotClosed = true;
    }

    public int getCount() {
        return count;
    }

    public void add() throws IOException {
        if (isNotClosed) {
            count++;
        }else throw new IOException("Вы обратились к закрытому ресурсу...");

    }

    @Override
    public void close() throws Exception {
        isNotClosed = false;

    }
}

