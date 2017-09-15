#include <SPI.h>
#include <MFRC522.h>

#define RST_PIN         9          
#define SS_PIN          10



MFRC522 mfrc522(SS_PIN, RST_PIN); 



//*****************************************************************************************//
void setup() {
  Serial.begin(9600);                                           // Initialize serial communications with the PC
  SPI.begin();                                                  // Init SPI bus
  mfrc522.PCD_Init();                                              // Init MFRC522 card
  Serial.println(F("Read personal data on a MIFARE PICC:"));    //shows in serial that it is ready to read
}

//*****************************************************************************************//
void loop() {

  


}
