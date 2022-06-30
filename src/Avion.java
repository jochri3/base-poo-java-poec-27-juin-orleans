class Avion{
   private int nombreSieges;
   private String constructeur;
   private float longueur;

// Getters
   public int getNombreSieges(){
      return nombreSieges;
   }

   public String getConstructeur(){
      return constructeur;
   }

   public float getLongueur(){
      return longueur;
   }

//   Setters
   public void setLongueur(float longueur){
      this.longueur=longueur;
   }

   public void setNombreSieges(int nombreSieges){
      this.nombreSieges=nombreSieges;
   }

   public void setConstructeur(String constructeur){
      this.constructeur=constructeur;
   }

}
