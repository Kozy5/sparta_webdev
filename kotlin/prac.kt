fun main() {
    class player(var nickname:String,var skill:String, var level:Int){
    fun levelUp(){
        println("${nickname}소환사님 레벨업! ${level} 레벨이 되신것을 축하합니다!")
        level++
    } 
    fun recomendSkill(){
        println("${skill}스킬을 써보시는것도 괜찮을꺼같아요")
    }
    fun useSkill(){
        println("용맹한 ${nickname}의 ${skill}!!!!!!!!!!!")
    }
}
    var nickName = "구맹"
    var skillName = "몰라의 일격"
    var lep = 1
    var sohwan = player(nickName,skillName,lep)
    
    
    sohwan.levelUp()
   
    
    
}

