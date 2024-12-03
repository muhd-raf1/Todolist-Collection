package view;

import entity.TodolistEntity;
import logic.TodolistLogic;
import util.InputUser;

public class TodolistView {

    private TodolistLogic todolistLogic;

    public TodolistView(TodolistLogic todolistLogic) {
        this.todolistLogic = todolistLogic;
    }

    private static String backToMainPage = "info : ketik 'b' untuk kembali ke halaman utama";

    public void pageShowAllData() {
        while (true) {
            System.out.println(" T O D O L I S T");
            todolistLogic.getAll();
            System.out.println("--------------------");
            System.out.println("1. Tambah Data Baru");
            System.out.println("2. Hapus Data");
            System.out.println("3. Update Data");
            System.out.println("x. Keluar Dari Sistem");

            var input = InputUser.inputFromUser("Pilih");

            if (input.equals("1")) {
                pageAddNewData();
            } else if (input.equals("2")) {
                pageDeleteData();
            } else if (input.equals("3")) {
                pageUpdateData();
            } else if (input.equals("x")) {
                break;
            } else {
                System.out.println("Maaf. Sila Cuba Lagi \b");
            }
        }
    }

    public void pageAddNewData() {
        System.out.println("A D D  N E W  D A T A");
        System.out.println(backToMainPage);
        var inputNewData = InputUser.inputFromUser("Data Baru");

        if (inputNewData.equals("b")) {
            pageShowAllData();
        } else {
            todolistLogic.addData(inputNewData);
        }
    }

    public void pageDeleteData() {
        System.out.println("D E L E T E  D A T A");
        System.out.println(backToMainPage);
        var inputNumData = InputUser.inputFromUser("Number Data");

        if (inputNumData.equals("b")) {
            pageShowAllData();

        } else {
            // * try-catch jika terdapat kesalahan ketika memasukkan number data
            try {
                var numData = Integer.parseInt(inputNumData);
                todolistLogic.deleteData(numData);

            } catch (NumberFormatException exception) {
                System.out.println("Terdapat Kesalahan ketika memasukkan Number data: "
                        + exception);
                pageShowAllData();
            }
        }

    }

    public void pageUpdateData() {
        System.out.println("U P D A T E  D A T A");
        System.out.println(backToMainPage);
        System.out.println("Sila isi di ruang 'Input New Updated Data' !");

        var inputNumData = InputUser.inputFromUser("Input Number Data");
        var inputUpdateData = InputUser.inputFromUser("Input New Updated Data");

        if (inputUpdateData.equals("b")) {
            pageShowAllData();

        } else {
            // * try-catch jika terdapat kesalahan ketika memasukkan number data
            try {
                TodolistEntity UpdatedData = new TodolistEntity(inputUpdateData);

                todolistLogic.updateData(Integer.parseInt(inputNumData), UpdatedData);

            } catch (NumberFormatException exception) {
                System.out.println("Terdapat Kesalahan ketika memasukkan Number data: "
                        + exception);
                pageShowAllData();
            }
        }
    }
}
