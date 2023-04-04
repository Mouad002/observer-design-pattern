public class ObserverImp2 implements Observer{

    @Override
    public void update(Observable o) {
        int etat = ((ObservableConcret)o).getEtat();
        System.out.println("observer 2 | result is "+etat*2);
    }

}
