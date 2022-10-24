package com.fzg.provider.configuration;

import com.alibaba.csp.sentinel.adapter.servlet.callback.RequestOriginParser;
import com.ctc.wstx.util.StringUtil;
import org.apache.commons.lang.StringUtils;

import javax.servlet.http.HttpServletRequest;

public class RequestOriginParserDefinition implements RequestOriginParser {

    @Override
    public String parseOrigin(HttpServletRequest httpServletRequest) {
        String name = httpServletRequest.getParameter("name");
        if (StringUtils.isEmpty(name)) {
            throw new RuntimeException("name is null");
        }
        return name;
    }
}
