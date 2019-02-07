package wonderland

import org.scalatest._
import wonderland.Coder.{decipher, decode, encode}

class CoderSpec extends FlatSpec with Matchers {

  "encode" should "encode a message with a secret keyword" in {
    encode("vigilance", "meetmeontuesdayeveningatseven") should be("hmkbxebpxpmyllyrxiiqtoltfgzzv")
    encode("scones", "meetmebythetree") should be("egsgqwtahuiljgs")
  }

  "decode" should "decode a message given an encoded message and a secret keyword" in {
    decode("vigilance", "hmkbxebpxpmyllyrxiiqtoltfgzzv") should be("meetmeontuesdayeveningatseven")
    decode("scones", "egsgqwtahuiljgs") should be("meetmebythetree")
  }

  "decipher" should "extract the secret keyword given an encrypted message and the original message" in {
    decipher("opkyfipmfmwcvqoklyhxywgeecpvhelzg", "thequickbrownfoxjumpsoveralazydog") should be("vigilance")
    decipher("hcqxqqtqljmlzhwiivgbsapaiwcenmyu", "packmyboxwithfivedozenliquorjugs") should be("scones")
    decipher("hfnlphoontutufa", "hellofromrussia") should be("abcabcx")
  }
}
