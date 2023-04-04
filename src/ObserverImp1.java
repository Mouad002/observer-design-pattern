public class ObserverImp1 implements Observer{

    @Override
    public void update(Observable o) {
        int etat = ((ObservableConcret)o).getEtat();
        System.out.println("observer 1 | result is "+etat);
    }

}
