import java.security.InvalidParameterException;
import java.io.*;
    class acomodacoes{
        private int roomId;
        private String roomType;
        private double price;
        private int reviews;
        private double overallSatisfaction;
        private int accommodates;
        private double bedrooms;
        private String propertyType;
        private int hostId;
        private String country;
        private String city;
        private String neighbourhood;

        public acomodacoes(int roomId, String roomType, double price, int reviews,double overallSatisfaction, int accommodates, double bedrooms, String propertyType,int hostId, String country, String city, String neighbourhood){
            this.roomId = roomId;
            this.roomType = roomType;
            this.price = price;
            this.reviews = reviews;
            this.overallSatisfaction = overallSatisfaction;
            this.accommodates = accommodates;
            this.bedrooms = bedrooms;
            this.propertyType = propertyType;
            this.hostId = hostId;
            this.country = country;
            this.city = city;
            this.neighbourhood = neighbourhood;
        }

        public acomodacoes(){
                
                this.roomId = 0;
                this.roomType = "";
                this.price = 0;
                this.reviews = 0;
                this.overallSatisfaction = 0;
                this.accommodates = 0;
                this.bedrooms = 0;
                this.propertyType = "";
                this.hostId = 0;
                this.country = "";
                this.city = "";
                this.neighbourhood = "";
            
        }
        
       
       
        public int getRoomId(){
            return this.roomId;
        }
        public void setRoomId(int roomId) throws InvalidParameterException {
            if(roomId >= 0){
                this.roomId = roomId;
            }else{
                throw new InvalidParameterException("Id de quarto Invalido");
            }

        }


        public String getRoomType(){
            return this.roomType;
        }
        public void setRoomType(String roomType){
                this.roomType = roomType;
            }



        public double getPrice(){
            return this.price;
        }
        public void setPrice(double price) throws InvalidParameterException {
            if(price >= 0){
                this.price = price;
            }else{
                throw new InvalidParameterException("Preço Invalido");
            }
        }

        public int getReviews(){
            return this.reviews;
        }
        public void reviews(int reviews) {  
                this.reviews = roomId;
        }


        public double getOverallSatisfaction(){
            return this.overallSatisfaction;
        }
        public void setOverallSatisfaction(double overallSatisfaction) throws InvalidParameterException {
            if(overallSatisfaction >= 0){
                this.overallSatisfaction = overallSatisfaction;
            }else{
                throw new InvalidParameterException("Satisfação Geral Invalida");
            }
        }


        public int getAccommodates(){
            return this.accommodates;
        }
        public void setAccommodates(int accommodates) throws InvalidParameterException{
            if(accommodates >= 0){
                this.accommodates = accommodates;
            }else{
                throw new InvalidParameterException("Numero de acomodados invalida");
            }
        }

        
        public double getBedrooms(){
            return bedrooms;
        }
        public void setBedrooms(int bedrooms) throws InvalidParameterException{
            if(bedrooms >= 0){
                this.bedrooms = bedrooms;
            }else{
                throw new InvalidParameterException("Numero de quartos invalida");
            }
        }

        public String getPropertyType(){
            return propertyType;
        }
        public void setPropertyType(String propertyType){
            this.propertyType = propertyType;
        }


        public int getHostId(){
            return hostId;
        }
        public void setHostId(int hostId) throws InvalidParameterException{
            if(hostId >= 0){
                this.hostId = hostId;
            }else{
                throw new InvalidParameterException("Numero do ID do usuario invalido");
            }
        }


        public String getCountry(){
            return country;
        }
        public void setCountry(String country){
            this.country = country;
        }


        public String getCity(){
            return city;
        }
        public void setCity(String city){
            this.city = city;
        }


        public String getNeighbourhood(){
            return neighbourhood;
        }
        public void setNeighbourhood(String neighbourhood){
            this.neighbourhood = neighbourhood;
        }

        public void read(String buffer){
            String[] atributos = new String[12];
            atributos = buffer.split("\t");
            this.roomId = Integer.parseInt(atributos[0]);
            this.hostId = Integer.parseInt(atributos[1]);
            this.roomType = atributos[2];
            this.country = atributos[3];
            this.city = atributos[4];
            this.neighbourhood = atributos[5];
            this.reviews = Integer.parseInt(atributos[6]);
            this.overallSatisfaction = Double.parseDouble(atributos[7]);
            this.accommodates = Integer.parseInt(atributos[8]);
            this.bedrooms = Double.parseDouble(atributos[9]);
            this.price = Double.parseDouble(atributos[10]);
            this.propertyType = atributos[11];
           
            
           
            
     }

        public void imprimir(){
            MyIO.println("["+ roomId + " ## " + hostId + " ## "  + roomType + " ## " + country + " ## " + city + "##"  + neighbourhood + "##" 
            + reviews + " ## " + overallSatisfaction + " ## " + accommodates + " ## " + bedrooms + " ## " + price + " ## " + 
            propertyType + "]");

     }

     



        
    }

    public  class App {


        public static void main(String[] args) throws Exception {
            int quantidade = MyIO.readInt();
            acomodacoes[] todosQuartos = new acomodacoes[quantidade]; 
    
            for(int i = 0 ;i < quantidade; i++){
                String buffer = MyIO.readLine();
                todosQuartos[i] = new acomodacoes();
                todosQuartos[i].read(buffer);
            }
            String id = MyIO.readLine();

            while(!id.equals("FIM")){
            int aux = Integer.parseInt(id); 
            for(int i = 0;i < quantidade;i++){
                if(aux == todosQuartos[i].getRoomId()){
                    todosQuartos[i].imprimir();
                    i = quantidade;
                }
            }
                //pesquisa e imprime

            id = MyIO.readLine();

        }
    }

}

    


        
        

    
    
   
