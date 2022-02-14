public enum Message {
    ARRAY_LENGTH("Количество элементов в массиве - "),
    ARRAY_OUT_MEMORY("Не достаточно памяти для создания такого массива"),
    AVG("Среднее значение в массиве равно "),
    CACHE("Число взято из кэша:"),
    CHOOSE_ACTION
            ("""
                    Выберите действие:
                    1 - решить квадратное уравнение
                    2 - найти факториал
                    0 - выйти из программы"""),
    CHOOSE_ARRAY_ACTION
            ("""
                    Выберите действие:
                    1 - найти минимум
                    2 - найти максимум
                    3 - найти среднее арифметическое
                    4 - вывести массив в консоль
                    0 - вернуться"""),
    CONDITION_1(" больше 0 и"),
    CONDITION_2(" не больше 2147483647 "),
    EQUATION("Уравнение "),
    ERROR("Неизвестная ошибка"),
    EXTREME_VAL("%s значение в массиве - %s (элемент %s)"),
    FIBONACCI("Число № %s в последовательности Фибоначчи равно %s "),
    FIBONACCI_START("Вычисление начнется с числа № %s"),
    INIT_INTEGER("Введите целое число"),
    INIT_NOT_0("Введите целое число не равное 0"),
    INIT_NOT_NEGATIVE("Введите неотрицательное целое число"),
    INVALID_COEFFICIENT("Первый коэффициент не может быть равен 0"),
    INVALID_LINE(" не является числом"),
    INVALID_NUMBER(" - неправильный формат числа"),
    IO_ERROR("Ошибка ввода/вывода"),
    IRRATIONAL_ROOT("Квадратный корень из %s не является рациональным числом"),
    NO_ROOTS(" не имеет действительных корней"),
    ONE_ROOT(" имеет один корень:\nx = "),
    OPERATION_OUT_MEMORY("Не достаточно памяти для данной операции"),
    RATIONAL_ROOT("Корень квадратный из %s равен ±%s"),
    REQUEST("Выйти из программы? ('Y', 'N')"),
    RESUME("""
            Выберите действие:
            1 - продолжить
            0 - выйти из программы
            """),
    TOO_MUCH("""
             - слишком большое число
            1 - продолжить
            2 - ввести другое число
            """),
    TWO_ROOTS(" имеет два корня:\nx1 = ");

    private String msg;

    Message(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
