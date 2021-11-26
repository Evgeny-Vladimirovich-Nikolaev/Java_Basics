public enum AnimalsMsg {

    END("0 - закончить дрессировку\n"),
    CHOOSE_PET("""
            Выберите питомца:
            1 - Щенок
            2 - Котёнок
            3 - Крыса
            4 - Хомячок
            5 - Тигренок
            0 - Отмена"""),
    SCENARIO_1("""
            Выберите развитие:
            1 - начать дрессировку
            2 - добавить животное
            0 - выйти"""),
    SCENARIO_2("""
            Выберите развитие:
            1 - начать дрессировку
            0 - выйти"""),
    SHOW("У вас есть:\n"),
    START("Кому дать задание:\n"),
    TASK("""
            Выберите задание:
            1 - бежать
            2 - плыть
            0 - отмена"""),
    DISTANCE("Определите дистанцию (не больше 1000)"),
    SET_NAME("Придумайте имя своему питомцу (не более 20 символов)."),
    ERROR_DISTANCE("Дистанция не может быть нулевой или отрицательной");

    private String msg;

    AnimalsMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
