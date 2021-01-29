<#macro masterCss>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="renderer" content="webkit">
    <link rel="shortcut icon" href="/static/img/favicon.png"/>
    <link rel="stylesheet" type="text/css" href="/static/third/layui/css/layui.css"/>
    <link rel="stylesheet" type="text/css" href="${request.contextPath}${urls.getForLookupPath('/css/style.css')}"/>
</#macro>

<#macro masterJs>
    <script type='text/javascript'
            src="/static/third/jquery/jquery.js"></script>
    <script type='text/javascript'
            src="/static/third/layui/layui.js"></script>
    <script type='text/javascript'
            src="/static/third/juicer/juicer-min.js"></script>
    <script type='text/javascript' src='${request.contextPath}${urls.getForLookupPath('/common/base.js')}'></script>
    <script type='text/javascript'
            src="/static/common/juicer-config.js"></script>
</#macro>
