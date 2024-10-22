package structure;

import java.util.List;
import java.util.Map;

public class FindUserByEmail {
    // 특정 이메일로 사용자 정보 찾기
    public static void main(String[] args) {
        List<Map<String, Object>> users = List.of(
                Map.of(
                        "id", "id1",
                        "pw", "qwer",
                        "email", "asd@email.com"
                ),
                Map.of(
                        "id", "id2",
                        "pw", "qwer",
                        "email", "asd@email.com"
                ),
                Map.of(
                        "id", "some_id",
                        "pw", "qwer",
                        "email", "asds@email.com"
                ),
                Map.of(
                        "id", "other_id",
                        "pw", "qwer",
                        "email", "asdq@email.com"
                ),
                Map.of(
                        "id", "someId",
                        "pw", "qwer",
                        "email", "asd@email.com"
                ),
                Map.of(
                        "id", "otherId",
                        "pw", "qwer",
                        "email", "fasdd@email.com"
                ),
                Map.of(
                        "id", "nickname",
                        "pw", "qwer",
                        "email", "acvb@email.com"
                ),
                Map.of(
                        "id", "hello",
                        "pw", "qwer",
                        "email", "fasdd@email.com"
                )
        );
        String targetEmail = "asd@email.com";
        boolean foound = false;

       for (int i = 0; i < users.size(); i++){
           Map<String, Object> user = users.get(i);
           if (user.get("email").equals(targetEmail)){
               System.out.println("사용자 정보: " + user);
               foound = true;
               break;
           } else {
               System.out.println("해당 이메일을 가진 사용자는 없습니다");
           }
       }
    }
}
