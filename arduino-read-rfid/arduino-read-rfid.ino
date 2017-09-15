#include <SPI.h>
#include <MFRC522.h>

#define RST_PIN         9          
#define SS_PIN          10



MFRC522 r(SS_PIN, RST_PIN);

void setup(){
  Serial.begin(9600);
  SPI.begin();
  r.PCD_Init();
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
  Serial.println(conteudo);
  
}



