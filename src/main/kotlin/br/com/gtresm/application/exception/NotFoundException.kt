package br.com.gtresm.application.exception

import java.lang.RuntimeException

class NotFoundException(override val message: String?): RuntimeException()