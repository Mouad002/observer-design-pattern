
public class Main {
    public static void main(String[] args) {
        ObservableConcret observable = new ObservableConcret();
        ObserverImp1 ob1 = new ObserverImp1();
        ObserverImp2 ob2 = new ObserverImp2();
        observable.addObserver(ob1);
        observable.addObserver(ob2);
        observable.setEtat(3);
        observable.deleteObserver(ob2);
        System.out.println("----------------------------------------------------------");
        observable.setEtat(5);
    }
}