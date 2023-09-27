package ra.run;

import ra.controller.SingerController;
import ra.controller.SongController;
import ra.model.Singer;
import ra.model.Song;
import ra.utils.InputMethods;

import java.util.Scanner;

public class MusicManagement {
    private final static SingerController singerController = new SingerController();
    private final static SongController songController = new SongController();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\u001B[36m\n⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜MUSIC-MANAGEMENT⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜\n" + "\t\t\t 1. Quản lý ca sĩ \n" + "\t\t\t 2. Quản lý bài hát \n" + "\t\t\t 3. Tìm kiếm bài hát \n" + "\t\t\t 4. Thoát \n");
            System.out.print("Nhập lựa chọn với số tương ứng: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    menuSingerManager();
                    break;
                case 2:
                    menuSongManager();
                    break;
                case 3:
                    menuSearchManager();
                    break;
                case 4:
                    System.out.println("Chương trình kết thúc!!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhập sai, chỉ nhập số từ 1 đến 4 theo mục tương ứng!!!");
            }
        }
    }

    public static void menuSingerManager() {
        System.out.print("Nhập lựa chọn với số tương ứng: ");
        int choice = 0;
        while (choice != 5) {
            System.out.println("\u001B[36m\n⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜SINGER-MANAGEMENT⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜\n" + "\t\t\t 1. Nhập vào số lượng ca sĩ cần thêm và nhập thông tin cần thêm mới\n" + "\t\t\t 2. Hiển thị danh sách tất cả ca sĩ đã lưu trữ  \n" + "\t\t\t 3. Thay đổi thông tin ca sĩ theo mã id  \n" + "\t\t\t 4. Xóa ca sĩ theo mã id \n" + "\t\t\t 5. Thoát \n");
            choice = InputMethods.getInteger();
            int currentIndex = 0;
            Singer[] singers = new Singer[100];
            Scanner sc = new Scanner(System.in);
            switch (choice) {
                case 1:
//                    System.out.println("Nhập số lương Ca Sĩ muốn thêm : ");
//                    int soCaSy = sc.nextInt();
//                    sc.nextLine();
//                    for (int i = 0; i < soCaSy; i++) {
//                        System.out.println("Nhập thông tin Ca sỹ :" + (currentIndex + 1));
//                        singers[currentIndex] = new Singer();
//                        singers[currentIndex].inputData();
//                        currentIndex++;
//                    }
                    createNewSinger();
                    break;
                case 2:
                   showListSinger();
                    break;
                case 3:
                    editSingerInfo();
                    break;
                case 4:
                    deleteSinger();
                    break;
                case 5:
                    System.out.println("Thoát!");
                    break;
                default:
                    System.out.println("Nhập sai, chỉ nhập số từ 1 đến 5 theo mục tương ứng!!!");
            }
        }
    }

    public static void menuSongManager() {
        System.out.print("Nhập lựa chọn với số tương ứng: ");
        int choice = 0;
        while (choice != 5) {
            System.out.println("\u001B[36m\n⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜SONG-MANAGEMENT⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜\n" + "\t\t\t 1.Nhập vào số lượng bài hát cần thêm và nhập thông tin cần thêm mới \n" + "\t\t\t 2.Hiển thị danh sách tất cả bài hát đã lưu trữ \n" + "\t\t\t 3.Thay đổi thông tin bài hát theo mã id \n" + "\t\t\t 4.Xóa bài hát theo mã id\n" + "\t\t\t 5. Thoát \n");
            choice = InputMethods.getInteger();
            switch (choice) {
                case 1:
                    createNewSong();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Thoát!");
                    break;
                default:
                    System.out.println("Nhập sai, chỉ nhập số từ 1 đến 4 theo mục tương ứng!!!");
            }
        }
    }

    public static void menuSearchManager() {
        System.out.print("Nhập lựa chọn với số tương ứng: ");
        int choice = 0;
        while (choice != 5) {
            System.out.println("\u001B[36m\n⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜SEARCH-MANAGEMENT⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜\n" + "\t\t\t 1.Tìm kiếm bài hát theo tên ca sĩ hoặc thể loại \n" + "\t\t\t 2.Tìm kiếm ca sĩ theo tên hoặc thể loại \n" + "\t\t\t 3.Hiển thị danh sách bài hát theo thứ tự tên tăng dầ \n" + "\t\t\t 4.Hiển thị 10 bài hát được đăng mới nhất\n" + "\t\t\t5. Thoát \n");
            choice = InputMethods.getInteger();
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Thoát!");
                    break;
                default:
                    System.out.println("Nhập sai, chỉ nhập số từ 1 đến 4 theo mục tương ứng!!!");
            }
        }
    }

    public static void createNewSinger() {
        int size = singerController.getSize();
        int maxInput = singerController.getAll().length - size;
        System.out.println("Nhập vào số lượng cần thêm mới");
        int n;
        while (true) {
            n = InputMethods.getPositiveInteger();
            if (n > maxInput) {
                System.err.println("Số lượng phần tử quá lớn vui lòng nhập lại");
            } else {
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho ca sĩ thứ " + (i + 1));
            Singer newSinger = new Singer();
            int newId = singerController.getNewId();
            newSinger.setSingerId(newId);
            System.out.println("New ID : " + newId);
            newSinger.inputData();
            singerController.save(newSinger);
        }
    }
    public static void showListSinger() {
        if (singerController.getSize() == 0) {
            System.err.println("Không có ca sĩ nào ");
            return;
        }

        for (Singer singer : singerController.getAll()
        ) {
            if (singer != null) {
                singer.displayData();
            }
        }
    }
    public static void editSingerInfo() {
        System.out.println("Nhập vào id cần sửa");
        int idEdit = InputMethods.getInteger();
        Singer editSinger = singerController.findById(idEdit);
        if(editSinger ==null){
            System.err.println("Không tìm thấy ca sĩ ");
            return;
        }
        editSinger.inputData();
        singerController.save(editSinger);
    }
    public static void deleteSinger(){
        System.out.println("nhập vào id cần xóa ");
        int idDel = InputMethods.getInteger();
        singerController.deleteSinger(idDel);
    }
    // MenuSongManagerment
    public static void createNewSong() {
        // nhập vào số lượng cbài hát cần thêm mới
        // lưu ý , phải có ca sĩ rồi ms thêm được bài hát
        if (singerController.getSize() == 0) {
            System.err.println("Không có ca sĩ nào , vui lóng quay ại thêm ca sĩ trước");
            return;
        }
        int size = songController.getSize();
        // lấy ra số lượng tối đâ có thể thêm mới
        int maxInput = songController.getAll().length - size;
        System.out.println("Nhập vào số lượng cần thêm mới");
        int n;
        while (true) {
            n = InputMethods.getPositiveInteger();
            if (n > maxInput) {
                System.err.println("Số lượng phần tử quá lớn vui lòng nhập lại");
            } else {
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho bai hat thứ " + (i + 1));
            Song newSong = new Song();
            // nhập tat thông tin còn lại
            newSong.inputData(songController.getAll(), singerController.getAll());
            // tiến hành them mới vào mảng
            songController.save(newSong);
        }
    }

}
