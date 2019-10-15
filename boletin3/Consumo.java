package boletin3;


public class Consumo {
    private float km ;
    private float Litros;
    private float vMed;       
    private float pGas ;
    
    //Constructores
    public Consumo(){
    
}
    public Consumo(float k, float l, float vM, float pG){
    km= k;
    Litros= l;
    vMed= vM;
    pGas= pG;
    
}

public void amosar(){
System.out.println("km: " +km + "Litros: " + Litros + "vMed: " + vMed + "pGas: " + pGas);

}
    public void setkm(float k){
        km=k;
        
    } 
        
    public float getKm(){
        return km;
        
    }
        public void setLitros(float l){
        Litros=l;
        
    } 
        
    public float getLitros(){
        return Litros;
        
    }
        public void setvMed(float vM){
        vMed=vM;
        
    } 
        
    public float getvMed(){
        return vMed;
        
    }
        public void setpGas(float pG){
        pGas=pG;
        
    } 
        
    public float getpGas(){
        return pGas;
        
    }
    
    public float consuMedio(){
        float consu= 100*Litros /km ;
        return consu;
        
    }
    public float consuEuro(){
        float consu= pGas / km * 100 ;
        return consu;
}
    
}