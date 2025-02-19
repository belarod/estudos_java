public class Methods {
    public static void main(String[] args) { //main pq é o método principal; void pq não vai retornar nada, e static pq não precisa instanciar a classe
        /*<tipo de retorno do método> identificador*camelCase* (<tipo> parâmetro){
        return <algo do mesmo tipo de retorno>;
        }
        */

        sayHello();
        String alarmMsg = setAlarm(2, 30);
        System.out.println(alarmMsg);
    }

    static void sayHello() {
        System.out.println("Hello");
    }
    
    static String setAlarm(int hour, int minute) {
        return "Alarm set to " + hour + ":" + minute;
    }
}
