package ra.service;

import ra.model.Song;

public class SongService {
    private Song[] songs = new Song[100];
    private int size = 0;

    public Song[] getAllSongs() {
        return songs;
    }

    public int getSize() {
        return size;
    }

    public void save(Song song) {
        if (findById(song.getSongId()) == null) {
            for (int i = 0; i < songs.length; i++) {
                if (songs[i] == null) {
                    songs[i] = song;
                    size++;
                    System.out.println("thêm mới thành công");
                    return;
                }
            }
        } else {

            for (int i = 0; i < songs.length; i++) {
                if (songs[i] != null && songs[i].getSongId().equals(song.getSongId())) {
                    songs[i] = song;
                    System.out.println("cập nhật thành công");
                    return;
                }
            }
        }
    }

    public Song findById(String id) {
        for (Song song : songs
        ) {
            if (song != null && song.getSongId().equals(id)) {
                return song;
            }
        }
        return null;
    }

    public void deleteSong(String idDel) {
        if (findById(idDel) == null) {
            System.err.println("ID không tồn tại");
            return;
        }
        for (int i = 0; i < songs.length; i++) {
            if (songs[i] != null && songs[i].getSongId().equals(idDel)) {
                songs[i] = null;
                size--;
                System.out.println("Xóa thành công");
                break;
            }
        }
    }
}




