import logic.TodolistLogic;
import logic.TodolistLogicImpl;
import view.TodolistView;

public class App {
    public static void main(String[] args) {
        TodolistLogic todolistLogic = new TodolistLogicImpl();
        TodolistView todolistView = new TodolistView(todolistLogic);

        todolistView.pageShowAllData();
    }
}
