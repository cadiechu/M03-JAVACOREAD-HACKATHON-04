package ra.service;

import ra.model.Singer;

public class SingerService {
    private Singer[] singers = new Singer[100];
    private int size = 0;

    public Singer[] getAllSingers() {
        return singers;
    }

    public int getSize() {
        return size;

    }

    public Singer findById(int id) {
        for (Singer sing : singers
        ) {
            if (sing != null && sing.getSingerId() == id) {
                return sing;
            }
        }
        return null;
    }
    public int getNewId(){
        int max=0;
        for (Singer sing : singers
        ) {
            if(sing!=null && sing.getSingerId()> max){
                max = sing.getSingerId();
            }
        }
        return max+1;
    }
    public  void deleteSinger(int idDel){
        if(findById(idDel) == null){
            System.err.println("ID không tồn tại");
            return;
        }
        for (int i = 0; i < singers.length; i++) {
            if(singers[i]!=null && singers[i].getSingerId() == idDel) {
                singers[i] = null;
                size--;
                System.out.println("Xóa thành công");
                break;
            }
        }

    }

    public void save(Singer singer) {
        if(findById(singer.getSingerId())==null){
            for (int i = 0; i < singers.length; i++) {
                if(singers[i]== null){
                    singers[i] = singer;
                    size++;
                    System.out.println("thêm mới thành công");
                    return;
                }
            }
        }else {
            for (int i = 0; i < singers.length; i++) {
                if(singers[i]!= null && singers[i].getSingerId()==singer.getSingerId()){
                    singers[i] = singer;
                    System.out.println("cập nhật thành công");
                    return;
                }
            }
        }
    }
}
