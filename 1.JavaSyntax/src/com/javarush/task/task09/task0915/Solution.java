package com.javarush.task.task09.task0915;

import java.io.CharConversionException;
import java.io.IOException;
import java.nio.file.FileSystemException;

/* 
Перехват выборочных исключений
*/

public class Solution {
    /**
     * [1]Создается объект класса StatelessBean
     *  в этом классе (соответственно и объекте) есть два метода:
     *      log - выводит на экран сообщение об исключении и его подробности,
     *      methodThrowExceptions - генерирует число и в зависимости от того,
     *      чему оно равно выбрасывает исключение
     */
    public static StatelessBean BEAN = new StatelessBean();

    public static void main(String[] args) throws FileSystemException {
        /**
         * [2]запускается функция handleExceptions, в которой в созданном
         * объекте BEAN запускается метод methodThrowExceptions
         */
        try {
            handleExceptions();
        }
        catch (CharConversionException e) {
            BEAN.log(e);
        }
        catch (IOException e) {
            BEAN.log(e);
        }
    }

    public static void handleExceptions() throws FileSystemException, CharConversionException {
        /**
         * [3] В объекте BEAN запускается метод methodThrowExceptions,
         * который создает число и в зависимости от его значения выбрасывает
         * исключения, которые здесь обрабатываются
         */
        try {
            BEAN.methodThrowExceptions();
        }
        catch (FileSystemException e) {
            /**
             * В отличии от остальных catch, здесь выбрасывается исключение
             * FileSystemException. Чтобы можно было его выбросить, в методе
             * прописано throws FileSystemException
             */
            BEAN.log(e);
            throw e;
        }
        catch (CharConversionException e) {
            BEAN.log(e);
        }
        catch (IOException e) {
            BEAN.log(e);
        }
    }

    public static class StatelessBean {
        /**
         * [5]В метод log передается значение исключения. Выводится на экран его
         * сообщение и имя.
         * Сообщение можно задать в методе methodThrowExceptions
         */
        public void log (Exception exception) {
            System.out.println(exception.getMessage() + ", " + exception.getClass().getSimpleName());
        }

        public void methodThrowExceptions() throws CharConversionException, FileSystemException, IOException {
            /**
             * [4] Создается рандомное число от 0,0 до 1,0 и умножается на 3,
             * также оно приводится к типу int, т.е. отрезается дробная часть.
             * И, в зависимости от числа выбрасывается то или иное исключение
             */
            int i = (int) (Math.random() * 3);
            if (i == 0) {
                throw new CharConversionException();
            } else if (i == 1) {
                throw new FileSystemException("");
            } else if (i == 2) {
                throw new IOException();
            }
        }
    }
}
