package ra.model;

import ra.utils.InputMethods;

public class Singer {
    private int singerId;
    private String singerName;
    private int age;
    private String nationality;
    private boolean gender;
    private String genre;

    public Singer() {
    }

    public Singer(int singerId, String singerName, int age, String nationality, boolean gender, String genre) {
        this.singerId = singerId;
        this.singerName = singerName;
        this.age = age;
        this.nationality = nationality;
        this.gender = gender;
        this.genre = genre;
    }

    public int getSingerId() {
        return singerId;
    }

    public void setSingerId(int singerId) {
        this.singerId = singerId;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void inputData() {
        System.out.print("\u001B[36m Nhập Tên Ca Sĩ : ");
        do {
            String inputName = InputMethods.getString();
            if (inputName.trim().equals("")) {
                System.err.println("Tên Ca Sĩ. Mời nhập lại!!!");
            } else {
                System.out.println("Cập nhật thành công!");
                this.singerName = inputName;
                break;
            }
        } while (true);
        System.out.print("\u001B[36m Tuổi : ");
        this.age = InputMethods.getPositiveInteger();
        System.out.print("\u001B[36m Quốc Tịch : ");
        this.nationality = InputMethods.getString();
        System.out.print("\u001B[36m Giới Tính: \nNhâp (true) nếu bạn là nam.");
        this.gender = InputMethods.getBoolean();
        System.out.print("\u001B[36m Thể Loại :");
        this.genre = InputMethods.getString();
    }

    public void displayData() {
        System.out.println("🤍Tên Ca Sĩ:" + singerName);
        System.out.println("❤️ID:" + singerId);
        System.out.println("❤️Tuổi:" + age);
        System.out.println("❤️Quốc Tịch:" + nationality);
        System.out.println("❤️Giới tính:" + (gender ? "Nam" : "Nữ"));
        System.out.println("❤️Thể loại: " + genre);
        System.out.println("⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜");
    }
}
