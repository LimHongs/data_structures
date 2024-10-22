package structure;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupUsersByEmailDomain {
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
    Map<String,List<Map<String, Object>>> Domain = new HashMap<>();

    }
}
