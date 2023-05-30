package com.vavatech.springrestexample.service;

public interface BussinessInterface {

    record Case(int id, String desc) {}

    record MarketingCase(int id, String desc1, String marketingCaseDesc) {}
}
