package logic;

import java.util.ArrayList;
import java.util.List;

import entity.TodolistEntity;

public class TodolistLogicImpl implements TodolistLogic {

    List<TodolistEntity> dataTodolist = new ArrayList<>();

    @Override
    public void getAll() {
        for (TodolistEntity data : dataTodolist) {
            System.out.println((dataTodolist.indexOf(data) + 1) + ". " + data.getData());
        }
    }

    @Override
    public void addData(String newData) {
        TodolistEntity newDataTodolist = new TodolistEntity(newData);
        dataTodolist.add(newDataTodolist);
    }

    @Override
    public void deleteData(int numData) {

        // * menangkap exception ketika user memasukkan number index yang salah

        try {

            if (dataTodolist.contains(dataTodolist.get(numData - 1))) {
                dataTodolist.remove(numData - 1);
            }
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("Numbernya ga ada : " + exception);
        }
    }

    @Override
    public void updateData(int numData, TodolistEntity updateData) {

        // * menangkap exception ketika user memasukkan number index yang salah

        try {
            // * valudasi untuk mengecek apakah number indexnya ada atau tidak
            // * di collection dan untuk memastikan supaya user
            // * tidak memasukkan nilai null
            if (dataTodolist.contains(dataTodolist.get(numData - 1)) &&
                    updateData != null) {
                dataTodolist.set((numData - 1), updateData);
            }

        } catch (IndexOutOfBoundsException exception) {
            System.out.println("Numbernya ga ada : " + exception);
        }
    }

}
