package Animali;
public class Animali
{
    protected int zampe;
    protected String nome, specie, verso, mangia;

    public int getZampe() { return zampe; }
    public String getSpecie() { return specie; }
    public String getVerso() { return verso; }
    public String getMangia() { return mangia;}
    public String getnome() { return nome; }

    @Override
    public String toString(){
        return nome+": ha "+zampe+" zampe, appartiene ai "+ specie+", "+verso+" e mangia "+mangia;
    }

}
