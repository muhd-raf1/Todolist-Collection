package test;

import logic.TodolistLogic;
import logic.TodolistLogicImpl;
import view.TodolistView;

public class ViewTest {
    public static void main(String[] args) {
        testPageUpdateData();
    }

    private static TodolistLogic todolistLogic = new TodolistLogicImpl();
    private static TodolistView todolistView = new TodolistView(todolistLogic);

    public static void testPageShowAllData() {
        todolistView.pageShowAllData();
    }

    public static void testPageAddNewData() {
        todolistView.pageAddNewData();
    }

    public static void testPageDeleteData() {
        todolistView.pageDeleteData();
    }

    public static void testPageUpdateData() {
        todolistView.pageUpdateData();
    }

}
