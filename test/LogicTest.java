package test;

import entity.TodolistEntity;
import logic.TodolistLogic;
import logic.TodolistLogicImpl;

public class LogicTest {
    public static void main(String[] args) {
        testUpdateData();
    }

    private static TodolistLogic todolistLogic = new TodolistLogicImpl();

    public static void testAddData_n_GetAll() {
        todolistLogic.addData("Test 1");
        todolistLogic.addData("Test 2");
        todolistLogic.addData("Test 3");

        todolistLogic.getAll();
    }

    public static void testDeleteData() {
        todolistLogic.addData("Test 1");
        todolistLogic.addData("Test 2");
        todolistLogic.addData("Test 3");

        todolistLogic.deleteData(4);

        todolistLogic.getAll();
    }

    public static void testUpdateData() {
        todolistLogic.addData("Test 1");
        todolistLogic.addData("Test 2");
        todolistLogic.addData("Test 3");

        TodolistEntity testUpdateData = new TodolistEntity("Testing");
        todolistLogic.updateData(4, testUpdateData);

        todolistLogic.getAll();
    }
}
