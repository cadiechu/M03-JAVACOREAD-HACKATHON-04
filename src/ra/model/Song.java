package ra.model;

import ra.utils.InputMethods;

import java.util.Date;

public class Song {
    private String songId;
    private String songName;
    private String descriptions;
    private Singer singer;
    private String songWriter;
    private Date createdDate;
    private boolean songStatus;

    public Song() {
    }

    public Song(String songId, String songName, String descriptions, Singer singer, String songWriter, Date createdDate, boolean songStatus) {
        this.songId = songId;
        this.songName = songName;
        this.descriptions = descriptions;
        this.singer = singer;
        this.songWriter = songWriter;
        this.createdDate = createdDate;
        this.songStatus = songStatus;
    }

    public String getSongId() {
        return songId;
    }

    public void setSongId(String songId) {
        this.songId = songId;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Singer getSinger() {
        return singer;
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }

    public String getSongWriter() {
        return songWriter;
    }

    public void setSongWriter(String songWriter) {
        this.songWriter = songWriter;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public boolean isSongStatus() {
        return songStatus;
    }

    public void setSongStatus(boolean songStatus) {
        this.songStatus = songStatus;
    }

    public void inputData() {
        System.out.println("\u001B[35m Nhập mã bài hát:  \n(Có 4 ký tự và bắt đầu bằng kí tự S, không trùng lặp)");
        this.songId = InputMethods.getString();

        System.out.println("\u001B[35m Nhập tên bài hát");
        this.songName = InputMethods.getString();

        System.out.println("\u001B[35m Nhập mô tả: ");
        this.descriptions = InputMethods.getString();

        System.out.println("\u001B[35m Ca sĩ: ");

        System.out.println("\u001B[35m Người sáng tác: ");
        this.songWriter = InputMethods.getString();

        System.out.println("\u001B[35m Trang thái: ");
        this.songStatus = InputMethods.getBoolean();
    }

    public void displayData() {
        System.out.println("Thông tin Bài hát ");
        System.out.println("\u001B[35m ❤️ Mã bài hát: " + songId);
        System.out.println("\u001B[35m ❤️ Tên bài hát: "+songName);
        System.out.println("\u001B[35m ❤️ Mô tả: "+descriptions);
        System.out.println("\u001B[35m ❤️ Ca Sĩ:");
        System.out.println("\u001B[35m ❤️ Tác giả: "+songWriter);
        System.out.println("\u001B[35m ❤️ Trạng thaí: "+(songStatus?"Có":"Không"));
    }

    public void inputData(Song[] all, Singer[] all1) {
    }
}
