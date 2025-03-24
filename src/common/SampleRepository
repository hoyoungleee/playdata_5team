package common;


import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SampleRepository {

    //샘플 목록가져오기
    public List<Map<String, Object>> sampleSelect(){
        //조건없이 결과물 불러오는 sql
        String sql = "SELECT 가져올컬럼명 FROM 테이블명";
        //조건이 있는 결과물 불러오는 sql
//        String sql = "SELECT 가져올컬럼명 FROM sample WHERE 조건걸컬럼명 = ? ";
        //조건이 여러개 있는 결과물 불러오는 sql
//        String sql = "SELECT 가져올컬럼명 FROM sample WHERE 조건걸컬럼명 = ? AND n번째조건걸컬럼명 = ?";

        //목록데이터 담을 리스트변수
        List<Map<String, Object>> sampleList = new ArrayList<>();

        try(Connection conn = DBConnectionManager.getConnection();
            PreparedStatement prsmt = conn.prepareStatement(sql)){

            //select할때는 excuteQuery() 로 실행 후 ResultSet으로 받아옵니다.
            ResultSet rs = prsmt.executeQuery();
            while (rs.next()){
                Map<String,Object> row = new HashMap<>();
                row.put("문자열키값1",rs.getString("문자열데이터컬럼명"));
                row.put("문자열키값2",rs.getInt("정수형데이터컬럼명"));
                row.put("문자열키값3",rs.getDate("날짜형데이터컬럼명"));
                sampleList.add(row);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sampleList;
    }
    //샘플 Insert
    public void sampleInsert(Sample sample){
        //정식 insert sql
        String sql = "INSERT INTO 테이블명 (컬럼명1, 컬럼명2, ...) values (?,?,...)";
        //간편식 insert sql (컬럼 기본값 여부 상관없이 현재 넣으려는 테이블의 순서 갯수 맞춰서 값을 넣어야 정상진행됨.)
        //안그러면 오류나고 에러도 잘 안뜸.
//        String sql = "INSERT INTO 테이블명 values (?,?,...)";


        try(Connection conn = DBConnectionManager.getConnection();
            PreparedStatement prsmt = conn.prepareStatement(sql)){
            //행을 추가하거나 변경할 경우 오류를 막기위해 오토커밋 끄기
            conn.setAutoCommit(false);

            prsmt.setString(1, "넣을 변수명 혹은 값");// 앞자리에는 물음표 순서 그뒤에 값 조합으로 sql에 값을 세팅합니다.
            prsmt.setString(2, sample.getSampleName());// 앞자리에는 물음표 순서 그뒤에 값 조합으로 sql에 값을 세팅합니다.
            prsmt.setInt(3, sample.getSampleNumber());// 앞자리에는 물음표 순서 그뒤에 값 조합으로 sql에 값을 세팅합니다.

            prsmt.setDate(4, Date.valueOf(sample.getSampleDate()));
            // JDBC가 오래전 개발되어 데이터 타입도 이전버전의 Date 타입으로 전달하고 받아야 함. java.sql 패키지의 Date.valueOf()로 감싸서 해결


            //insert, update할때는 excuteUpdate() 로 실행 후 영향받은 행의 갯수를 반환해줍니다..
            //반환받은 int 값으로 내가 한 작업이 정상 처리 되었는지 검증로직을 추가할 수 있습니다.
            int flag = prsmt.executeUpdate();
            if(flag == 1 ){
                conn.commit();
                conn.setAutoCommit(true);
            }else{
                System.out.println("행이 올바르게 바뀌지 않았습니다.");
                conn.rollback();
                conn.setAutoCommit(true);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //샘플 UPDATE
    public void sampleUpdate(Sample sample){
        //정식 update sql
        String sql = "UPDATE 테이블명 SET 수정할 컬럼명 = 수정할값 ";

        //정식 update sql 여러개 수정
//        String sql = "UPDATE 테이블명 SET 수정할 컬럼명 = 수정할값 , 컬럼명2 = 수정할값2 ,...  WHERE 수정조건컬럼 = 조건값 ";



        try(Connection conn = DBConnectionManager.getConnection();
            PreparedStatement prsmt = conn.prepareStatement(sql)){
            //행을 추가하거나 변경할 경우 오류를 막기위해 오토커밋 끄기
            conn.setAutoCommit(false);

            prsmt.setString(1, "넣을 변수명 혹은 값");// 앞자리에는 물음표 순서 그뒤에 값 조합으로 sql에 값을 세팅합니다.
            prsmt.setString(2, sample.getSampleName());// 앞자리에는 물음표 순서 그뒤에 값 조합으로 sql에 값을 세팅합니다.
            prsmt.setInt(3, sample.getSampleNumber());// 앞자리에는 물음표 순서 그뒤에 값 조합으로 sql에 값을 세팅합니다.

            prsmt.setDate(4, Date.valueOf(sample.getSampleDate()));
            // JDBC가 오래전 개발되어 데이터 타입도 이전버전의 Date 타입으로 전달하고 받아야 함. java.sql 패키지의 Date.valueOf()로 감싸서 해결


            //insert, update할때는 excuteUpdate() 로 실행 후 영향받은 행의 갯수를 반환해줍니다..
            //반환받은 int 값으로 내가 한 작업이 정상 처리 되었는지 검증로직을 추가할 수 있습니다.
            int flag = prsmt.executeUpdate();
            if(flag == 1 ){
                conn.commit();
                conn.setAutoCommit(true);
            }else{
                System.out.println("행이 올바르게 바뀌지 않았습니다.");
                conn.rollback();
                conn.setAutoCommit(true);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
