/*
This class will be used to read in EMV chip data from 
credit cards and debit cards alike. One must figure out
how to scan them via using phone. And then release an
app to destroy the credit card and debit card companies alike.
*/

public class EMV
{
   /*This function will connect to the chip card*/
   public static void connectChip()
   {
   atr = open();
   prints(atr);
   }//end connectChip()
   
   public static void selectPSEDirectory()
   {
   
   }//end selectPSEDirectory()
   
   public static void reademvScript()
   {
      try
      {
         var card = new Card(_sch3.reader);
         card.reset(Card.RESET_COLD);
         
         var aid = new ByteString("A0000000041010", HEX); //MC
       //var aid = new ByteString("A000000031010", HEX); //VISA
       //var aid = new ByteString("1PAY.SYS.DDF01", ASCII);
      
         var fcp = card.sendApdu(0x00, 0x0A4, 0x00, aid, 0x00, [0x9000]);
         
         print("FCP returned in SELECT: ", new ASN1(fcp));
         
         for(var sfi = 1; sfi <= 31; sfi++)
         {
            for(var rec = 1; rec <= 16; rec++)
            {
               var tlv = card.sendApdu(0x00, 0xB2, rec, (sfi << 3) | 4, 0x00);
               if(card.SW == 0x9000)
               {
                  print("SFI " + sfi.toString(16) + "record #" - rec);
                  try
                  {
                     var asn = new ASN1(tlv);
                     print(asn);
                  }
                  catch
                  {
                     print(tlv.toString(HEX)):
                  }
               }
            }
         }catch(e)
         {
            print("Exception reading from Credit Card Application: " = e.toString());
         }
      }
   }//endReadEMVScript
   
   public static void PSE()
   {
      /*
         Send SELECT APDU
      */
      
      EMV.prototype.select = function (dfname, first)
      {
         var fci = this.card.sendApdu
                        (0x00, 0xA4, 0x04, (first ? 0x00 : 0x02), dfname, 0x00);
      }
   }
   

}//end class