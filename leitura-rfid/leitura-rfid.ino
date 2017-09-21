#include <SPI.h>
#include <MFRC522.h>

#define vermelho 7
#define verde 6

#define RST_PIN 9          
#define SS_PIN 10

String conteudo = "";

MFRC522 mfrc522(SS_PIN, RST_PIN);

void setup(){
  Serial.begin(9600);
  SPI.begin();
  mfrc522.PCD_Init();
  pinMode(vermelho, OUTPUT);
  pinMode(verde, OUTPUT);
}
void loop(){
  verificar(); 
}
void verificar(){
   conteudo;
   
  //Verifica se existe alguma tag próxima ou Lendo
  if(!mfrc522.PICC_IsNewCardPresent()){
    delay(50);
    return;
  }
  if(!mfrc522.PICC_ReadCardSerial()){
     delay(50);
     return;
  }
  
  
  //Faz a leitura e a concatenação dos valores obtidos 
  for (byte i=0; i<mfrc522.uid.size; i++)
  {
    conteudo.concat(String(mfrc522.uid.uidByte[i], HEX));

  }
  
 Serial.println(conteudo);
 delay(500);
 /*
  if(conteudo.equalsIgnoreCase(id)){
    digitalWrite(verde, HIGH);
    delay(1000);
    digitalWrite(verde, LOW);
  }else{
    digitalWrite(vermelho, HIGH);
    delay(1000);
    digitalWrite(vermelho, LOW);
  }
  */
}

