package com.crazy.dream.service.common;

import java.util.concurrent.Future;

public interface GenerateCodeService {

    Future<String> generateCode(String type, String name);
}
