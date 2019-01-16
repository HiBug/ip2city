# ip2city
利用geoLite2将ip转化为城市,包括*洲国省市*、*时区*、*经纬度*等信息

示例如下：
```java
input:
  "101.110.212.101"

output:
  {
  "city": {
    "geoNameId": 1796236,
    "name": "Shanghai",
    "names": {
      "de": "Shanghai",
      "ru": "Шанхай",
      "pt-BR": "Xangai",
      "ja": "上海",
      "en": "Shanghai",
      "fr": "Shanghai",
      "zh-CN": "上海",
      "es": "Shanghai"
    }
  },
  "continent": {
    "code": "AS",
    "geoNameId": 6255147,
    "name": "Asia",
    "names": {
      "de": "Asien",
      "ru": "Азия",
      "pt-BR": "Ásia",
      "ja": "アジア",
      "en": "Asia",
      "fr": "Asie",
      "zh-CN": "亚洲",
      "es": "Asia"
    }
  },
  "country": {
    "geoNameId": 1814991,
    "inEuropeanUnion": false,
    "isoCode": "CN",
    "name": "China",
    "names": {
      "de": "China",
      "ru": "Китай",
      "pt-BR": "China",
      "ja": "中国",
      "en": "China",
      "fr": "Chine",
      "zh-CN": "中国",
      "es": "China"
    }
  },
  "leastSpecificSubdivision": {
    "geoNameId": 1796231,
    "isoCode": "SH",
    "name": "Shanghai",
    "names": {
      "en": "Shanghai",
      "fr": "Municipalité de Shanghai",
      "zh-CN": "上海",
      "pt-BR": "Xangai"
    }
  },
  "location": {
    "accuracyRadius": 1,
    "latitude": 31.0456,
    "longitude": 121.3997,
    "timeZone": "Asia/Shanghai"
  },
  "maxMind": {},
  "mostSpecificSubdivision": {
    "$ref": "$.leastSpecificSubdivision"
  },
  "postal": {},
  "registeredCountry": {
    "geoNameId": 1814991,
    "inEuropeanUnion": false,
    "isoCode": "CN",
    "name": "China",
    "names": {
      "de": "China",
      "ru": "Китай",
      "pt-BR": "China",
      "ja": "中国",
      "en": "China",
      "fr": "Chine",
      "zh-CN": "中国",
      "es": "China"
    }
  },
  "representedCountry": {
    "inEuropeanUnion": false,
    "names": {}
  },
  "subdivisions": [
    {
      "$ref": "$.leastSpecificSubdivision"
    }
  ],
  "traits": {
    "anonymous": false,
    "anonymousProxy": false,
    "anonymousVpn": false,
    "hostingProvider": false,
    "ipAddress": "180.155.118.42",
    "legitimateProxy": false,
    "publicProxy": false,
    "satelliteProvider": false,
    "torExitNode": false
  }
}
```
