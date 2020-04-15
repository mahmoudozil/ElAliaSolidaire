package com.jendouba.solidarity

class Service() {
    var cin:String = ""
    var user:String = ""
    var adresse:String = ""
    var city: String = ""
    var tel:String = ""
    var service:String = ""
    var dateDemande:String = ""
    var databaseKey:String = ""

    constructor(cin:String, user: String, adresse: String, city:String, tel: String, service: String, dateDemande: String, databaseKey: String) : this() {
        this.cin = cin
        this.user = user
        this.adresse = adresse
        this.city = city
        this.tel = tel
        this.service = service
        this.dateDemande = dateDemande
        this.databaseKey = databaseKey
    }

    constructor(user: String, adresse: String, tel: String, service: String) : this() {
        this.user = user
        this.adresse = adresse
        this.tel = tel
        this.service = service
    }

}
