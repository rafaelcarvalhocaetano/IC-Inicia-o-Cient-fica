#include <SPI.h>
#include <MFRC522.h>

#define vermelho 7
#define verde 6

#define RST_PIN 9          
#define SS_PIN 10



MFRC522 r(SS_PIN, RST_PIN);

void setup(){
  Serial.begin(9600);
  SPI.begin();
  r.PCD_Init();
  pinMode(vermelho, OUTPUT);
  pinMode(verde, OUTPUT);
}
void loop(){
  leitura();
}
void leitura(){
  String conteudo = "";

  //Verifica se existe alguma tag próxima ou Lendo
  if(!r.PICC_IsNewCardPresent() || !r.PICC_ReadCardSerial()){
    delay(50);
    return;
  }
  
  
  //Faz a leitura e a concatenação dos valores obtidos 
  for (byte i = 0; i < r.uid.size; i++)
  {
    conteudo.concat(String(r.uid.uidByte[i]<0x10 ? " 0" : " "));
    conteudo.concat(String(r.uid.uidByte[i], HEX));

  }
  char id = "a6 dd 68 8e";
  if(conteudo==id){
    digitalWrite(vermelho, HIGH);
    delay(1000);
    digitalWrite(verde, LOW);
  }else{
    digitalWrite(verde, HIGH);
    delay(1000);
    digitalWrite(vermelho, LOW);
  }

  Serial.println(conteudo);

  
}



