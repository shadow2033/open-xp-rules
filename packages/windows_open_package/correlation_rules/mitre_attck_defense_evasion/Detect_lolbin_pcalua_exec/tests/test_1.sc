{"action": "start", "body": "{\"Event\":{\"xmlns\":\"http://schemas.microsoft.com/win/2004/08/events/event\",\"System\":{\"Provider\":{\"Name\":\"Microsoft-Windows-Sysmon\",\"Guid\":\"{5770385f-c22a-43e0-bf4c-06f5698ffbd9}\"},\"EventID\":\"1\",\"Version\":\"5\",\"Level\":\"4\",\"Task\":\"1\",\"Opcode\":\"0\",\"Keywords\":\"0x8000000000000000\",\"TimeCreated\":{\"SystemTime\":\"2019-05-12T17:01:50.7810152Z\"},\"EventRecordID\":\"16497\",\"Correlation\":\"\",\"Execution\":{\"ProcessID\":\"2012\",\"ThreadID\":\"300\"},\"Channel\":\"Microsoft-Windows-Sysmon/Operational\",\"Computer\":\"IEWIN7\",\"Security\":{\"UserID\":\"S-1-5-18\"}},\"EventData\":{\"Data\":[{\"Name\":\"RuleName\"},{\"Name\":\"UtcTime\",\"text\":\"2019-05-12 17:01:50.781\"},{\"Name\":\"ProcessGuid\",\"text\":\"{365abb72-517e-5cd8-0000-001024d61700}\"},{\"Name\":\"ProcessId\",\"text\":\"2952\"},{\"Name\":\"Image\",\"text\":\"C:\\\\Windows\\\\System32\\\\pcalua.exe\"},{\"Name\":\"FileVersion\",\"text\":\"6.1.7600.16385 (win7_rtm.090713-1255)\"},{\"Name\":\"Description\",\"text\":\"Program Compatibility Assistant\"},{\"Name\":\"Product\",\"text\":\"Microsoft® Windows® Operating System\"},{\"Name\":\"Company\",\"text\":\"Microsoft Corporation\"},{\"Name\":\"CommandLine\",\"text\":\"\\\"C:\\\\Windows\\\\System32\\\\pcalua.exe\\\" -a c:\\\\Windows\\\\system32\\\\calc.exe\"},{\"Name\":\"CurrentDirectory\",\"text\":\"C:\\\\Users\\\\IEUser\\\\\"},{\"Name\":\"User\",\"text\":\"IEWIN7\\\\IEUser\"},{\"Name\":\"LogonGuid\",\"text\":\"{365abb72-4fb5-5cd8-0000-0020f2350100}\"},{\"Name\":\"LogonId\",\"text\":\"0x135f2\"},{\"Name\":\"TerminalSessionId\",\"text\":\"1\"},{\"Name\":\"IntegrityLevel\",\"text\":\"Medium\"},{\"Name\":\"Hashes\",\"text\":\"SHA1=ABB6319976D9702E0C80978D51C0AEE88A33D201,MD5=D652BA887500816431566B524292ECCB,SHA256=65446AF2997779DB6CDAEFB2ABC2994CA9F2A2477C882BC3A5F828BBFFB83CEE,IMPHASH=256CD8CEDFD4FCB3BC9DB32E27E5923A\"},{\"Name\":\"ParentProcessGuid\",\"text\":\"{365abb72-516b-5cd8-0000-001087e41600}\"},{\"Name\":\"ParentProcessId\",\"text\":\"3788\"},{\"Name\":\"ParentImage\",\"text\":\"C:\\\\Windows\\\\System32\\\\cmd.exe\"},{\"Name\":\"ParentCommandLine\",\"text\":\"\\\"C:\\\\Windows\\\\system32\\\\cmd.exe\\\"\"}]}}}", "category.generic": "Process", "category.high": "Availability Management", "category.low": "Control", "datafield6": "365abb72-4fb5-5cd8-0000-0020f2350100", "event_src.category": "Other", "event_src.fqdn": "iewin7", "event_src.host": "iewin7", "event_src.hostname": "iewin7", "event_src.subsys": "Microsoft-Windows-Sysmon/Operational", "event_src.title": "sysmon", "event_src.vendor": "microsoft", "generator.type": "logcollector", "generator.version": "N26.0.2936", "id": "PT_Microsoft_Windows_eventlog_Sysmon_1_Process_creation", "importance": "info", "input_id": "00000000-0000-0000-0000-000000000000", "mime": "application/x-pt-eventlog", "msgid": "1", "normalized": true, "object": "process", "object.account.domain": "iewin7", "object.account.id": "synthetic:ieuser@iewin7", "object.account.name": "ieuser", "object.account.privileges": "Medium", "object.account.session_id": "79346", "object.process.cmdline": "\"C:\\Windows\\System32\\pcalua.exe\" -a c:\\Windows\\system32\\calc.exe", "object.process.cwd": "C:\\Users\\IEUser\\", "object.process.fullpath": "c:\\windows\\system32\\pcalua.exe", "object.process.guid": "365abb72-517e-5cd8-0000-001024d61700", "object.process.hash.imphash": "256CD8CEDFD4FCB3BC9DB32E27E5923A", "object.process.hash.md5": "D652BA887500816431566B524292ECCB", "object.process.hash.sha1": "ABB6319976D9702E0C80978D51C0AEE88A33D201", "object.process.hash.sha256": "65446AF2997779DB6CDAEFB2ABC2994CA9F2A2477C882BC3A5F828BBFFB83CEE", "object.process.id": "2952", "object.process.meta": "Description:Program Compatibility Assistant | Product:Microsoft® Windows® Operating System | Company:Microsoft Corporation", "object.process.name": "pcalua.exe", "object.process.parent.cmdline": "\"C:\\Windows\\system32\\cmd.exe\"", "object.process.parent.fullpath": "c:\\windows\\system32\\cmd.exe", "object.process.parent.guid": "365abb72-516b-5cd8-0000-001087e41600", "object.process.parent.id": "3788", "object.process.parent.name": "cmd.exe", "object.process.parent.path": "c:\\windows\\system32\\", "object.process.path": "c:\\windows\\system32\\", "object.process.version": "6.1.7600.16385 (win7_rtm.090713-1255)", "recv_ipv4": "127.0.0.1", "recv_time": "2023-06-18T11:57:05.702Z", "status": "success", "subject": "account", "subject.account.domain": "iewin7", "subject.account.id": "synthetic:ieuser@iewin7", "subject.account.name": "ieuser", "subject.account.privileges": "Medium", "subject.account.session_id": "79346", "tag": "some_tag", "task_id": "00000000-0000-0000-0000-000000000000", "taxonomy_version": "26.0.215-release-26.0", "time": "2019-05-12T17:01:50.781Z", "type": "raw", "uuid": "a1917dba-81e5-4d2a-9615-d17624372271"}
{"action": "start", "body": "{\"Event\":{\"xmlns\":\"http://schemas.microsoft.com/win/2004/08/events/event\",\"System\":{\"Provider\":{\"Name\":\"Microsoft-Windows-Sysmon\",\"Guid\":\"{5770385f-c22a-43e0-bf4c-06f5698ffbd9}\"},\"EventID\":\"1\",\"Version\":\"5\",\"Level\":\"4\",\"Task\":\"1\",\"Opcode\":\"0\",\"Keywords\":\"0x8000000000000000\",\"TimeCreated\":{\"SystemTime\":\"2019-05-12T17:01:51.0079509Z\"},\"EventRecordID\":\"16498\",\"Correlation\":\"\",\"Execution\":{\"ProcessID\":\"2012\",\"ThreadID\":\"300\"},\"Channel\":\"Microsoft-Windows-Sysmon/Operational\",\"Computer\":\"IEWIN7\",\"Security\":{\"UserID\":\"S-1-5-18\"}},\"EventData\":{\"Data\":[{\"Name\":\"RuleName\"},{\"Name\":\"UtcTime\",\"text\":\"2019-05-12 17:01:50.852\"},{\"Name\":\"ProcessGuid\",\"text\":\"{365abb72-517e-5cd8-0000-00105fe01700}\"},{\"Name\":\"ProcessId\",\"text\":\"2920\"},{\"Name\":\"Image\",\"text\":\"C:\\\\Windows\\\\System32\\\\calc.exe\"},{\"Name\":\"FileVersion\",\"text\":\"6.1.7600.16385 (win7_rtm.090713-1255)\"},{\"Name\":\"Description\",\"text\":\"Windows Calculator\"},{\"Name\":\"Product\",\"text\":\"Microsoft® Windows® Operating System\"},{\"Name\":\"Company\",\"text\":\"Microsoft Corporation\"},{\"Name\":\"CommandLine\",\"text\":\"\\\"C:\\\\Windows\\\\system32\\\\calc.exe\\\"\"},{\"Name\":\"CurrentDirectory\",\"text\":\"C:\\\\Users\\\\IEUser\\\\\"},{\"Name\":\"User\",\"text\":\"IEWIN7\\\\IEUser\"},{\"Name\":\"LogonGuid\",\"text\":\"{365abb72-4fb5-5cd8-0000-0020f2350100}\"},{\"Name\":\"LogonId\",\"text\":\"0x135f2\"},{\"Name\":\"TerminalSessionId\",\"text\":\"1\"},{\"Name\":\"IntegrityLevel\",\"text\":\"Medium\"},{\"Name\":\"Hashes\",\"text\":\"SHA1=9018A7D6CDBE859A430E8794E73381F77C840BE0,MD5=60B7C0FEAD45F2066E5B805A91F4F0FC,SHA256=80C10EE5F21F92F89CBC293A59D2FD4C01C7958AACAD15642558DB700943FA22,IMPHASH=F93B5D76132F6E6068946EC238813CE1\"},{\"Name\":\"ParentProcessGuid\",\"text\":\"{365abb72-517e-5cd8-0000-001024d61700}\"},{\"Name\":\"ParentProcessId\",\"text\":\"2952\"},{\"Name\":\"ParentImage\",\"text\":\"C:\\\\Windows\\\\System32\\\\pcalua.exe\"},{\"Name\":\"ParentCommandLine\",\"text\":\"\\\"C:\\\\Windows\\\\System32\\\\pcalua.exe\\\" -a c:\\\\Windows\\\\system32\\\\calc.exe\"}]}}}", "category.generic": "Process", "category.high": "Availability Management", "category.low": "Control", "datafield6": "365abb72-4fb5-5cd8-0000-0020f2350100", "event_src.category": "Other", "event_src.fqdn": "iewin7", "event_src.host": "iewin7", "event_src.hostname": "iewin7", "event_src.subsys": "Microsoft-Windows-Sysmon/Operational", "event_src.title": "sysmon", "event_src.vendor": "microsoft", "generator.type": "logcollector", "generator.version": "N26.0.2936", "id": "PT_Microsoft_Windows_eventlog_Sysmon_1_Process_creation", "importance": "info", "input_id": "00000000-0000-0000-0000-000000000000", "mime": "application/x-pt-eventlog", "msgid": "1", "normalized": true, "object": "process", "object.account.domain": "iewin7", "object.account.id": "synthetic:ieuser@iewin7", "object.account.name": "ieuser", "object.account.privileges": "Medium", "object.account.session_id": "79346", "object.process.cmdline": "\"C:\\Windows\\system32\\calc.exe\"", "object.process.cwd": "C:\\Users\\IEUser\\", "object.process.fullpath": "c:\\windows\\system32\\calc.exe", "object.process.guid": "365abb72-517e-5cd8-0000-00105fe01700", "object.process.hash.imphash": "F93B5D76132F6E6068946EC238813CE1", "object.process.hash.md5": "60B7C0FEAD45F2066E5B805A91F4F0FC", "object.process.hash.sha1": "9018A7D6CDBE859A430E8794E73381F77C840BE0", "object.process.hash.sha256": "80C10EE5F21F92F89CBC293A59D2FD4C01C7958AACAD15642558DB700943FA22", "object.process.id": "2920", "object.process.meta": "Description:Windows Calculator | Product:Microsoft® Windows® Operating System | Company:Microsoft Corporation", "object.process.name": "calc.exe", "object.process.parent.cmdline": "\"C:\\Windows\\System32\\pcalua.exe\" -a c:\\Windows\\system32\\calc.exe", "object.process.parent.fullpath": "c:\\windows\\system32\\pcalua.exe", "object.process.parent.guid": "365abb72-517e-5cd8-0000-001024d61700", "object.process.parent.id": "2952", "object.process.parent.name": "pcalua.exe", "object.process.parent.path": "c:\\windows\\system32\\", "object.process.path": "c:\\windows\\system32\\", "object.process.version": "6.1.7600.16385 (win7_rtm.090713-1255)", "recv_ipv4": "127.0.0.1", "recv_time": "2023-06-18T11:57:05.702Z", "status": "success", "subject": "account", "subject.account.domain": "iewin7", "subject.account.id": "synthetic:ieuser@iewin7", "subject.account.name": "ieuser", "subject.account.privileges": "Medium", "subject.account.session_id": "79346", "tag": "some_tag", "task_id": "00000000-0000-0000-0000-000000000000", "taxonomy_version": "26.0.215-release-26.0", "time": "2019-05-12T17:01:50.852Z", "type": "raw", "uuid": "a3e0c4e1-5d29-49ce-a9b5-01ff83ea0341"}

# Тут будет твой тест. В секции expect укажи сколько и каких корреляционных событий ты ожидаешь
expect 1 {"action": "start", "category.generic": "Attack", "category.high": "Defense Evasion", "category.low": "Indirect Command Execution", "correlation_name": "Detect_lolbin_pcalua_exec", "correlation_type": "incident", "event_src.fqdn": "iewin7", "event_src.host": "iewin7", "event_src.hostname": "iewin7", "event_src.subsys": "Microsoft-Windows-Sysmon/Operational", "event_src.title": "sysmon", "event_src.vendor": "microsoft", "importance": "medium", "incident.aggregation.key": "Detect_lolbin_pcalua_exec|iewin7|\"c:\\windows\\system32\\pcalua.exe\" -a c:\\windows\\system32\\calc.exe", "incident.aggregation.timeout": 7200, "incident.category": "Undefined", "incident.severity": "medium", "object": "process", "object.account.domain": "iewin7", "object.account.id": "synthetic:ieuser@iewin7", "object.account.name": "ieuser", "object.account.session_id": "79346", "object.process.cmdline": "\"C:\\Windows\\System32\\pcalua.exe\" -a c:\\Windows\\system32\\calc.exe", "object.process.cwd": "C:\\Users\\IEUser\\", "object.process.fullpath": "c:\\windows\\system32\\pcalua.exe", "object.process.guid": "365abb72-517e-5cd8-0000-001024d61700", "object.process.hash.md5": "D652BA887500816431566B524292ECCB", "object.process.hash.sha1": "ABB6319976D9702E0C80978D51C0AEE88A33D201", "object.process.hash.sha256": "65446AF2997779DB6CDAEFB2ABC2994CA9F2A2477C882BC3A5F828BBFFB83CEE", "object.process.id": "2952", "object.process.meta": "Description:Program Compatibility Assistant | Product:Microsoft® Windows® Operating System | Company:Microsoft Corporation", "object.process.name": "pcalua.exe", "object.process.parent.cmdline": "\"C:\\Windows\\system32\\cmd.exe\"", "object.process.parent.fullpath": "c:\\windows\\system32\\cmd.exe", "object.process.parent.guid": "365abb72-516b-5cd8-0000-001087e41600", "object.process.parent.id": "3788", "object.process.parent.name": "cmd.exe", "object.process.parent.path": "c:\\windows\\system32\\", "object.process.path": "c:\\windows\\system32\\", "object.process.version": "6.1.7600.16385 (win7_rtm.090713-1255)", "status": "success", "subject": "account", "subject.account.domain": "iewin7", "subject.account.id": "synthetic:ieuser@iewin7", "subject.account.name": "ieuser", "subject.account.privileges": "Medium", "subject.account.session_id": "79346"}