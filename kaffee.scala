class Kaffeautomat(private val preis :Int): 
  private var summe:Int = 0

   // preis, summe ist primaere konstruktor
  // 이 클래스는 커피 preis를 받아 초기화한다.

  def einwerfen(muenze: Int): Unit =
    if (muenze == 1 || muenze == 2 || muenze == 5) then
        this.summe += muenze // sekundaere konstruktor: in the body of the class implementiert
        println(this.summe)
    else
        println("Falsche Muenze")

  def mehr_einwerfen(muenzen:List[Int]):Unit =
    for (x <- muenzen) do
      einwerfen(x) // 위의 함수를 호출해서 값을 더한 값을 출력

  def kochen():Unit =
    if (this.summe >= preis)
      val restgeld = this.summe - preis
      println (restgeld)
    else
      println("nicht genuegend Geld")
