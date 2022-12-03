fun twofer(name: String?=null): String {
    var print ="you"
    if(name!=null){
        print=name
    }
    return "One for $print, one for me."
}
