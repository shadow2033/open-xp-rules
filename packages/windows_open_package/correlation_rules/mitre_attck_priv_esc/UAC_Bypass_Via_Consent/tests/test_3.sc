{"_checkpoint": 57615712018, "_meta": {"id": "01da0c7e-03b2-01ee-8c68-005056825a53", "time": "2023-06-05T15:02:22.4660000Z", "assetIds": ["1864e292-4880-0001-0000-000000000007"], "site_alias": "unknown site_id=null", "site_name": "unknown site_id=null", "site_address": "unknown site_id=null", "site_is_deleted": true}, "action": "start", "asset_ids": ["1864e292-4880-0001-0000-000000000007"], "body": "{\"Event\":{\"xmlns\":\"http://schemas.microsoft.com/win/2004/08/events/event\",\"System\":{\"Provider\":{\"Name\":\"Microsoft-Windows-Sysmon\",\"Guid\":\"{5770385f-c22a-43e0-bf4c-06f5698ffbd9}\"},\"EventID\":\"7\",\"Version\":\"3\",\"Level\":\"4\",\"Task\":\"7\",\"Opcode\":\"0\",\"Keywords\":\"0x8000000000000000\",\"TimeCreated\":{\"SystemTime\":\"2023-06-05T15:02:22.480032900Z\"},\"EventRecordID\":\"800891\",\"Correlation\":null,\"Execution\":{\"ProcessID\":\"3144\",\"ThreadID\":\"984\"},\"Channel\":\"Microsoft-Windows-Sysmon/Operational\",\"Computer\":\"wks05.example.com\",\"Security\":{\"UserID\":\"S-1-5-18\"}},\"EventData\":{\"Data\":[{\"text\":\"-\",\"Name\":\"RuleName\"},{\"text\":\"2023-06-05 15:02:22.466\",\"Name\":\"UtcTime\"},{\"text\":\"{20fff121-f8dd-647d-8401-000000003900}\",\"Name\":\"ProcessGuid\"},{\"text\":\"2328\",\"Name\":\"ProcessId\"},{\"text\":\"C:\\\\Windows\\\\System32\\\\consent.exe\",\"Name\":\"Image\"},{\"text\":\"C:\\\\Windows\\\\System32\\\\consent.exe.local\\\\amd64_microsoft.windows.common-controls_6595b64144ccf1df_6.0.17763.4377_none_de744a4e53489aa3\\\\comctl32.dll\",\"Name\":\"ImageLoaded\"},{\"text\":\"3.1.8.1904\",\"Name\":\"FileVersion\"},{\"text\":\"UACMe proxy DLL\",\"Name\":\"Description\"},{\"text\":\"UACMe\",\"Name\":\"Product\"},{\"text\":\"Hazardous Environments\",\"Name\":\"Company\"},{\"text\":\"Ikazuchi.dll\",\"Name\":\"OriginalFileName\"},{\"text\":\"MD5=9E5AED3F57CEBC5154F9373B2BB9BA05,SHA256=FF40C2F8E6635F4D33997EB928C72C1293C5A844185DFDD3FD444FFD8C959E80,IMPHASH=1C6B5C991BBBDC2B578EA7DEEF4AFA1B\",\"Name\":\"Hashes\"},{\"text\":\"false\",\"Name\":\"Signed\"},{\"text\":\"-\",\"Name\":\"Signature\"},{\"text\":\"Unavailable\",\"Name\":\"SignatureStatus\"},{\"text\":\"NT AUTHORITY\\\\SYSTEM\",\"Name\":\"User\"}]}}}", "category.generic": "Executable Module", "category.high": "Availability Management", "category.low": "Control", "datafield10": "Ikazuchi.dll", "datafield2": "2328", "datafield3": "c:\\windows\\system32\\", "datafield4": "consent.exe", "datafield6": "Description:UACMe proxy DLL | Product:UACMe | Company:Hazardous Environments", "datafield7": "20fff121-f8dd-647d-8401-000000003900", "event_src.asset": "1864e292-4880-0001-0000-000000000007", "event_src.category": "Other", "event_src.fqdn": "wks05.example.com", "event_src.host": "wks05.example.com", "event_src.hostname": "wks05", "event_src.rule": "-", "event_src.subsys": "Microsoft-Windows-Sysmon/Operational", "event_src.title": "sysmon", "event_src.vendor": "microsoft", "generator.type": "logcollector", "generator.version": "N26.0.2916", "historical": false, "id": "PT_Microsoft_Windows_eventlog_Sysmon_7_Image_loaded", "importance": "low", "incorrect_time": false, "input_id": "00000000-0000-0000-0000-000000000000", "job_id": "692db8c2-9d54-11eb-a8b3-0242ac130003", "mime": "application/x-pt-eventlog", "msgid": "7", "normalized": true, "object": "module", "object.account.provider": "local", "object.name": "comctl32.dll", "object.path": "c:\\windows\\system32\\consent.exe.local\\amd64_microsoft.windows.common-controls_6595b64144ccf1df_6.0.17763.4377_none_de744a4e53489aa3\\", "object.process.fullpath": "c:\\windows\\system32\\consent.exe.local\\amd64_microsoft.windows.common-controls_6595b64144ccf1df_6.0.17763.4377_none_de744a4e53489aa3\\comctl32.dll", "object.process.hash": "IMPHASH:1C6B5C991BBBDC2B578EA7DEEF4AFA1B MD5:9E5AED3F57CEBC5154F9373B2BB9BA05 SHA256:FF40C2F8E6635F4D33997EB928C72C1293C5A844185DFDD3FD444FFD8C959E80", "object.process.hash.imphash": "1C6B5C991BBBDC2B578EA7DEEF4AFA1B", "object.process.hash.md5": "9E5AED3F57CEBC5154F9373B2BB9BA05", "object.process.hash.sha256": "FF40C2F8E6635F4D33997EB928C72C1293C5A844185DFDD3FD444FFD8C959E80", "object.process.meta": "Description:UACMe proxy DLL | Product:UACMe | Company:Hazardous Environments", "object.process.name": "comctl32.dll", "object.process.original_name": "Ikazuchi.dll", "object.process.path": "c:\\windows\\system32\\consent.exe.local\\amd64_microsoft.windows.common-controls_6595b64144ccf1df_6.0.17763.4377_none_de744a4e53489aa3\\", "object.property": "signature status", "object.value": "not signed", "object.version": "3.1.8.1904", "origin_app_alias": "MP-1", "origin_app_id": "185957ea-0f40-0001-0000-000000000002", "primary_siem_app_alias": "MP-1", "primary_siem_app_id": "185957ea-0f40-0001-0000-000000000002", "recv_asset": "1864e292-4880-0001-0000-000000000007", "recv_host": "wks05", "recv_ipv4": "1.2.3.4", "remote": false, "scope_id": "00000000-0000-0000-0000-000000000005", "siem_alias": "1.2.3.4", "siem_id": "e944c6fa-4174-4bb7-afae-98b42faee6b2", "site_address": "unknown site_id=null", "site_alias": "unknown site_id=null", "site_name": "unknown site_id=null", "status": "success", "subject": "process", "subject.account.domain": "nt authority", "subject.account.id": "synthetic:system@nt authority", "subject.account.name": "system", "subject.process.fullpath": "c:\\windows\\system32\\consent.exe", "subject.process.guid": "20fff121-f8dd-647d-8401-000000003900", "subject.process.id": "2328", "subject.process.name": "consent.exe", "subject.process.path": "c:\\windows\\system32\\", "tag": "wineventlog", "taxonomy_version": "26.0.215-release-26.0", "tenant_id": "00000000-0000-0000-0000-000000000000", "time": "2023-06-05T15:02:22.466Z", "uuid": "01da0c7e-03b2-01ee-8c68-005056825a53"}
{"_checkpoint": 57615712010, "_meta": {"id": "01da0c76-03b2-01ee-8c68-005056825a53", "time": "2023-06-05T15:01:49.2630000Z", "assetIds": ["1864e292-4880-0001-0000-000000000007"], "site_alias": "unknown site_id=null", "site_name": "unknown site_id=null", "site_address": "unknown site_id=null", "site_is_deleted": true}, "action": "start", "asset_ids": ["1864e292-4880-0001-0000-000000000007"], "body": "{\"Event\":{\"xmlns\":\"http://schemas.microsoft.com/win/2004/08/events/event\",\"System\":{\"Provider\":{\"Name\":\"Microsoft-Windows-Sysmon\",\"Guid\":\"{5770385f-c22a-43e0-bf4c-06f5698ffbd9}\"},\"EventID\":\"1\",\"Version\":\"5\",\"Level\":\"4\",\"Task\":\"1\",\"Opcode\":\"0\",\"Keywords\":\"0x8000000000000000\",\"TimeCreated\":{\"SystemTime\":\"2023-06-05T15:01:49.265081800Z\"},\"EventRecordID\":\"800883\",\"Correlation\":null,\"Execution\":{\"ProcessID\":\"3144\",\"ThreadID\":\"984\"},\"Channel\":\"Microsoft-Windows-Sysmon/Operational\",\"Computer\":\"wks05.example.com\",\"Security\":{\"UserID\":\"S-1-5-18\"}},\"EventData\":{\"Data\":[{\"text\":\"-\",\"Name\":\"RuleName\"},{\"text\":\"2023-06-05 15:01:49.263\",\"Name\":\"UtcTime\"},{\"text\":\"{20fff121-f8dd-647d-8401-000000003900}\",\"Name\":\"ProcessGuid\"},{\"text\":\"2328\",\"Name\":\"ProcessId\"},{\"text\":\"C:\\\\Windows\\\\System32\\\\consent.exe\",\"Name\":\"Image\"},{\"text\":\"10.0.17763.3232 (WinBuild.160101.0800)\",\"Name\":\"FileVersion\"},{\"text\":\"Consent UI for administrative applications\",\"Name\":\"Description\"},{\"text\":\"Microsoft® Windows® Operating System\",\"Name\":\"Product\"},{\"text\":\"Microsoft Corporation\",\"Name\":\"Company\"},{\"text\":\"consent.exe\",\"Name\":\"OriginalFileName\"},{\"text\":\"consent.exe 368 272 00000285D6BE22C0\",\"Name\":\"CommandLine\"},{\"text\":\"C:\\\\Windows\\\\system32\\\\\",\"Name\":\"CurrentDirectory\"},{\"text\":\"NT AUTHORITY\\\\SYSTEM\",\"Name\":\"User\"},{\"text\":\"{20fff121-f3f7-647d-e703-000000000000}\",\"Name\":\"LogonGuid\"},{\"text\":\"0x3e7\",\"Name\":\"LogonId\"},{\"text\":\"1\",\"Name\":\"TerminalSessionId\"},{\"text\":\"System\",\"Name\":\"IntegrityLevel\"},{\"text\":\"MD5=C67713C28BB97E685FEB88FFAEB96788,SHA256=6272541FD22C1D9B5DFE9364A0A1D6B12BBCAA28EFA0504E3A344E967AEA9C5C,IMPHASH=1275A84E15AAA739F3099F6A73D7D6FA\",\"Name\":\"Hashes\"},{\"text\":\"{20fff121-f3f8-647d-1300-000000003900}\",\"Name\":\"ParentProcessGuid\"},{\"text\":\"368\",\"Name\":\"ParentProcessId\"},{\"text\":\"C:\\\\Windows\\\\System32\\\\svchost.exe\",\"Name\":\"ParentImage\"},{\"text\":\"C:\\\\Windows\\\\system32\\\\svchost.exe -k netsvcs -p\",\"Name\":\"ParentCommandLine\"},{\"text\":\"NT AUTHORITY\\\\SYSTEM\",\"Name\":\"ParentUser\"}]}}}", "category.generic": "Process", "category.high": "Availability Management", "category.low": "Control", "datafield1": "999", "datafield10": "consent.exe", "datafield19": "consent.exe (2328) ← svchost.exe (368) ← services.exe (648) ← wininit.exe (520) ← smss.exe (408) ← smss.exe (324)", "datafield2": "368", "datafield3": "c:\\windows\\system32\\", "datafield4": "svchost.exe", "datafield5": "consent.exe 368 272 00000285D6BE22C0", "datafield6": "20fff121-f3f7-647d-e703-000000000000", "datafield7": "999", "datafield8": "20fff121-f8dd-647d-8401-000000003900", "datafield9": "C:\\Windows\\system32\\svchost.exe -k netsvcs -p", "event_src.asset": "1864e292-4880-0001-0000-000000000007", "event_src.category": "Other", "event_src.fqdn": "wks05.example.com", "event_src.host": "wks05.example.com", "event_src.hostname": "wks05", "event_src.subsys": "Microsoft-Windows-Sysmon/Operational", "event_src.title": "sysmon", "event_src.vendor": "microsoft", "generator.type": "logcollector", "generator.version": "N26.0.2916", "historical": false, "id": "PT_Microsoft_Windows_eventlog_Sysmon_1_Process_creation", "importance": "info", "incorrect_time": false, "input_id": "00000000-0000-0000-0000-000000000000", "job_id": "692db8c2-9d54-11eb-a8b3-0242ac130003", "mime": "application/x-pt-eventlog", "msgid": "1", "normalized": true, "object": "process", "object.account.domain": "nt authority", "object.account.id": "synthetic:system@nt authority", "object.account.name": "system", "object.account.privileges": "System", "object.account.provider": "local", "object.account.session_id": "999", "object.hash": "6272541FD22C1D9B5DFE9364A0A1D6B12BBCAA28EFA0504E3A344E967AEA9C5C", "object.id": "2328", "object.name": "consent.exe", "object.path": "c:\\windows\\system32\\", "object.process.chain": "consent.exe ← svchost.exe ← services.exe ← wininit.exe ← smss.exe ← smss.exe", "object.process.cmdline": "consent.exe 368 272 00000285D6BE22C0", "object.process.cwd": "C:\\Windows\\system32\\", "object.process.fullpath": "c:\\windows\\system32\\consent.exe", "object.process.guid": "20fff121-f8dd-647d-8401-000000003900", "object.process.hash": "IMPHASH:1275A84E15AAA739F3099F6A73D7D6FA MD5:C67713C28BB97E685FEB88FFAEB96788 SHA256:6272541FD22C1D9B5DFE9364A0A1D6B12BBCAA28EFA0504E3A344E967AEA9C5C", "object.process.hash.imphash": "1275A84E15AAA739F3099F6A73D7D6FA", "object.process.hash.md5": "C67713C28BB97E685FEB88FFAEB96788", "object.process.hash.sha256": "6272541FD22C1D9B5DFE9364A0A1D6B12BBCAA28EFA0504E3A344E967AEA9C5C", "object.process.id": "2328", "object.process.meta": "Description:Consent UI for administrative applications | Product:Microsoft® Windows® Operating System | Company:Microsoft Corporation", "object.process.name": "consent.exe", "object.process.original_name": "consent.exe", "object.process.parent.cmdline": "C:\\Windows\\system32\\svchost.exe -k netsvcs -p", "object.process.parent.fullpath": "c:\\windows\\system32\\svchost.exe", "object.process.parent.guid": "20fff121-f3f8-647d-1300-000000003900", "object.process.parent.id": "368", "object.process.parent.name": "svchost.exe", "object.process.parent.path": "c:\\windows\\system32\\", "object.process.path": "c:\\windows\\system32\\", "object.process.version": "10.0.17763.3232 (WinBuild.160101.0800)", "object.property": "metadata", "object.value": "Description:Consent UI for administrative applications | Product:Microsoft® Windows® Operating System | Company:Microsoft Corporation", "object.version": "10.0.17763.3232 (WinBuild.160101.0800)", "origin_app_alias": "MP-1", "origin_app_id": "185957ea-0f40-0001-0000-000000000002", "primary_siem_app_alias": "MP-1", "primary_siem_app_id": "185957ea-0f40-0001-0000-000000000002", "recv_asset": "1864e292-4880-0001-0000-000000000007", "recv_host": "wks05", "recv_ipv4": "1.2.3.4", "remote": false, "scope_id": "00000000-0000-0000-0000-000000000005", "siem_alias": "1.2.3.4", "siem_id": "e944c6fa-4174-4bb7-afae-98b42faee6b2", "site_address": "unknown site_id=null", "site_alias": "unknown site_id=null", "site_name": "unknown site_id=null", "status": "success", "subject": "account", "subject.account.domain": "nt authority", "subject.account.id": "synthetic:system@nt authority", "subject.account.name": "system", "subject.account.privileges": "System", "subject.account.session_id": "999", "subject.domain": "nt authority", "subject.name": "system", "subject.state": "on behalf of oneself", "tag": "wineventlog", "taxonomy_version": "26.0.215-release-26.0", "tenant_id": "00000000-0000-0000-0000-000000000000", "time": "2023-06-05T15:01:49.263Z", "uuid": "01da0c76-03b2-01ee-8c68-005056825a53"}

# Тут будет твой тест. В секции expect укажи сколько и каких корреляционных событий ты ожидаешь
expect 1 								{"action":"start","alert.key":"consent.exe|c:\\windows\\system32\\consent.exe.local\\amd64_microsoft.windows.common-controls_6595b64144ccf1df_6.0.17763.4377_none_de744a4e53489aa3\\comctl32.dll","asset_ids":null,"category.generic":"Attack","category.high":"Privilege Escalation","category.low":"Bypass User Account Control","correlation_name":"UAC_Bypass_Via_Consent","correlation_type":"event","datafield6":"20fff121-f3f7-647d-e703-000000000000","event_src.asset":"1864e292-4880-0001-0000-000000000007","event_src.category":"Other","event_src.fqdn":"wks05.example.com","event_src.host":"wks05.example.com","event_src.hostname":"wks05","event_src.rule":"-","event_src.subsys":"Microsoft-Windows-Sysmon/Operational","event_src.title":"sysmon","event_src.vendor":"microsoft","importance":"medium","incident.aggregation.key":"UAC_Bypass_Via_Consent|wks05.example.com|consent.exe|c:\\windows\\system32\\consent.exe.local\\amd64_microsoft.windows.common-controls_6595b64144ccf1df_6.0.17763.4377_none_de744a4e53489aa3\\comctl32.dll","incident.aggregation.timeout":7200,"incident.category":"Undefined","incident.severity":"medium","object":"module","object.process.fullpath":"c:\\windows\\system32\\consent.exe.local\\amd64_microsoft.windows.common-controls_6595b64144ccf1df_6.0.17763.4377_none_de744a4e53489aa3\\comctl32.dll","object.process.hash":"IMPHASH:1C6B5C991BBBDC2B578EA7DEEF4AFA1B MD5:9E5AED3F57CEBC5154F9373B2BB9BA05 SHA256:FF40C2F8E6635F4D33997EB928C72C1293C5A844185DFDD3FD444FFD8C959E80","object.process.hash.md5":"9E5AED3F57CEBC5154F9373B2BB9BA05","object.process.hash.sha256":"FF40C2F8E6635F4D33997EB928C72C1293C5A844185DFDD3FD444FFD8C959E80","object.process.meta":"Description:UACMe proxy DLL | Product:UACMe | Company:Hazardous Environments","object.process.name":"comctl32.dll","object.process.original_name":"Ikazuchi.dll","object.process.path":"c:\\windows\\system32\\consent.exe.local\\amd64_microsoft.windows.common-controls_6595b64144ccf1df_6.0.17763.4377_none_de744a4e53489aa3\\","object.property":"signature status","object.value":"not signed","status":"success","subject":"process","subject.account.domain":"nt authority","subject.account.id":"synthetic:system@nt authority","subject.account.name":"system","subject.account.session_id":"999","subject.process.chain":"consent.exe ← svchost.exe ← services.exe ← wininit.exe ← smss.exe ← smss.exe","subject.process.cmdline":"consent.exe 368 272 00000285D6BE22C0","subject.process.cwd":"C:\\Windows\\system32\\","subject.process.fullpath":"c:\\windows\\system32\\consent.exe","subject.process.guid":"20fff121-f8dd-647d-8401-000000003900","subject.process.hash":"IMPHASH:1275A84E15AAA739F3099F6A73D7D6FA MD5:C67713C28BB97E685FEB88FFAEB96788 SHA256:6272541FD22C1D9B5DFE9364A0A1D6B12BBCAA28EFA0504E3A344E967AEA9C5C","subject.process.hash.md5":"C67713C28BB97E685FEB88FFAEB96788","subject.process.hash.sha256":"6272541FD22C1D9B5DFE9364A0A1D6B12BBCAA28EFA0504E3A344E967AEA9C5C","subject.process.id":"2328","subject.process.meta":"Description:Consent UI for administrative applications | Product:Microsoft® Windows® Operating System | Company:Microsoft Corporation","subject.process.name":"consent.exe","subject.process.original_name":"consent.exe","subject.process.parent.cmdline":"C:\\Windows\\system32\\svchost.exe -k netsvcs -p","subject.process.parent.fullpath":"c:\\windows\\system32\\svchost.exe","subject.process.parent.guid":"20fff121-f3f8-647d-1300-000000003900","subject.process.parent.id":"368","subject.process.parent.name":"svchost.exe","subject.process.parent.path":"c:\\windows\\system32\\","subject.process.path":"c:\\windows\\system32\\","subject.process.version":"10.0.17763.3232 (WinBuild.160101.0800)"}