package me.whiteship.chapter01.item08.cleaner_as_a_safetynet;

// cleaner 안전망을 갖춘 자원을 제대로 활용하는 클라이언트 (45쪽)
public class Adult {
    public static void main(String[] args) {
        try (Room myRoom = new Room(7)) {
            System.out.println("Adult");
        }
    }

    // 출력결과
//    Adult
//    Cleaning room
//    by AutoCloseable close method /* Room 클래스에서 AutoCloseable 의 close를 오버라이딩한 메서드 호출됨 */
}