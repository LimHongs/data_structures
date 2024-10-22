package structure;

import java.util.List;
import java.util.Map;

public class ChangePassword {
    // pasword 변경
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
        String targetId = "id1"; // 비밀번호를 변경할 사용자 ID
        String newPassword = "newpassword";

        for (Map<String, Object> user : users) {
            if (user.get("id").equals(targetId)) {
                user.put("pw", newPassword);
                System.out.println("비밀번호 변경 완료: " + user);
                return;
            }
        }
        System.out.println("해당 ID를 가진 사용자가 없습니다.");
    }
}
