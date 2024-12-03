package logic;

import entity.TodolistEntity;

public interface TodolistLogic {

    void getAll();

    void addData(String newData);

    void deleteData(int numData);

    void updateData(int numData, TodolistEntity updateData);
}
