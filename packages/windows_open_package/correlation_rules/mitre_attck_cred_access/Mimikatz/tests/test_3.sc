{"action": "start", "body": "{\"Event\":{\"xmlns\":\"http://schemas.microsoft.com/win/2004/08/events/event\",\"System\":{\"Provider\":{\"Name\":\"Microsoft-Windows-Sysmon\",\"Guid\":\"{5770385f-c22a-43e0-bf4c-06f5698ffbd9}\"},\"EventID\":\"1\",\"Version\":\"5\",\"Level\":\"4\",\"Task\":\"1\",\"Opcode\":\"0\",\"Keywords\":\"0x8000000000000000\",\"TimeCreated\":{\"SystemTime\":\"2023-05-15T09:53:08.1290798Z\"},\"EventRecordID\":\"21121982\",\"Correlation\":null,\"Execution\":{\"ProcessID\":\"2984\",\"ThreadID\":\"1920\"},\"Channel\":\"Microsoft-Windows-Sysmon/Operational\",\"Computer\":\"Win10x64-154.testlab.esc\",\"Security\":{\"UserID\":\"S-1-5-18\"}},\"EventData\":{\"Data\":[{\"text\":\"-\",\"Name\":\"RuleName\"},{\"text\":\"2023-05-15 09:53:08.126\",\"Name\":\"UtcTime\"},{\"text\":\"{63310a87-0104-6462-5d1f-000000001b00}\",\"Name\":\"ProcessGuid\"},{\"text\":\"3700\",\"Name\":\"ProcessId\"},{\"text\":\"C:\\\\tools\\\\bibikatz_trunk\\\\x64\\\\bibikatz.exe\",\"Name\":\"Image\"},{\"text\":\"2.2.0.0\",\"Name\":\"FileVersion\"},{\"text\":\"custom file description\",\"Name\":\"Description\"},{\"text\":\"bibikatz\",\"Name\":\"Product\"},{\"text\":\"Custom company\",\"Name\":\"Company\"},{\"text\":\"bibikatz.exe\",\"Name\":\"OriginalFileName\"},{\"text\":\"bibikatz.exe  privilege::debug sekurlsa::msv\",\"Name\":\"CommandLine\"},{\"text\":\"C:\\\\tools\\\\bibikatz_trunk\\\\x64\\\\\",\"Name\":\"CurrentDirectory\"},{\"text\":\"TESTLAB\\\\vasya\",\"Name\":\"User\"},{\"text\":\"{63310a87-d18f-63d3-8410-0d0000000000}\",\"Name\":\"LogonGuid\"},{\"text\":\"0xd1084\",\"Name\":\"LogonId\"},{\"text\":\"2\",\"Name\":\"TerminalSessionId\"},{\"text\":\"High\",\"Name\":\"IntegrityLevel\"},{\"text\":\"MD5=6EDAEB2D29A6B377A0A02C416E6B00D0,SHA256=609B0B3824A99FD78A5E18EDD3461976EB3D7304A2D377210E0F845CDF964D78,IMPHASH=9528A0E91E28FBB88AD433FEABCA2456\",\"Name\":\"Hashes\"},{\"text\":\"{63310a87-fbe9-6461-8b1e-000000001b00}\",\"Name\":\"ParentProcessGuid\"},{\"text\":\"6728\",\"Name\":\"ParentProcessId\"},{\"text\":\"C:\\\\Windows\\\\System32\\\\cmd.exe\",\"Name\":\"ParentImage\"},{\"text\":\"\\\"C:\\\\WINDOWS\\\\system32\\\\cmd.exe\\\" \",\"Name\":\"ParentCommandLine\"},{\"text\":\"TESTLAB\\\\vasya\",\"Name\":\"ParentUser\"}]}}}", "category.generic": "Process", "category.high": "Availability Management", "category.low": "Control", "datafield6": "63310a87-d18f-63d3-8410-0d0000000000", "event_src.category": "Other", "event_src.fqdn": "win10x64-154.testlab.esc", "event_src.host": "win10x64-154.testlab.esc", "event_src.hostname": "win10x64-154", "event_src.subsys": "Microsoft-Windows-Sysmon/Operational", "event_src.title": "sysmon", "event_src.vendor": "microsoft", "generator.type": "logcollector", "generator.version": "N26.0.2936", "id": "PT_Microsoft_Windows_eventlog_Sysmon_1_Process_creation", "importance": "info", "input_id": "00000000-0000-0000-0000-000000000000", "mime": "application/x-pt-eventlog", "msgid": "1", "normalized": true, "object": "process", "object.account.domain": "testlab", "object.account.id": "synthetic:vasya@testlab", "object.account.name": "vasya", "object.account.privileges": "High", "object.account.session_id": "856196", "object.process.cmdline": "bibikatz.exe  privilege::debug sekurlsa::msv", "object.process.cwd": "C:\\tools\\bibikatz_trunk\\x64\\", "object.process.fullpath": "c:\\tools\\bibikatz_trunk\\x64\\bibikatz.exe", "object.process.guid": "63310a87-0104-6462-5d1f-000000001b00", "object.process.hash.imphash": "9528A0E91E28FBB88AD433FEABCA2456", "object.process.hash.md5": "6EDAEB2D29A6B377A0A02C416E6B00D0", "object.process.hash.sha256": "609B0B3824A99FD78A5E18EDD3461976EB3D7304A2D377210E0F845CDF964D78", "object.process.id": "3700", "object.process.meta": "Description:custom file description | Product:bibikatz | Company:Custom company", "object.process.name": "bibikatz.exe", "object.process.original_name": "bibikatz.exe", "object.process.parent.cmdline": "\"C:\\WINDOWS\\system32\\cmd.exe\"", "object.process.parent.fullpath": "c:\\windows\\system32\\cmd.exe", "object.process.parent.guid": "63310a87-fbe9-6461-8b1e-000000001b00", "object.process.parent.id": "6728", "object.process.parent.name": "cmd.exe", "object.process.parent.path": "c:\\windows\\system32\\", "object.process.path": "c:\\tools\\bibikatz_trunk\\x64\\", "object.process.version": "2.2.0.0", "recv_ipv4": "127.0.0.1", "recv_time": "2023-05-15T09:57:43.023Z", "status": "success", "subject": "account", "subject.account.domain": "testlab", "subject.account.id": "synthetic:vasya@testlab", "subject.account.name": "vasya", "subject.account.privileges": "High", "subject.account.session_id": "856196", "tag": "some_tag", "task_id": "00000000-0000-0000-0000-000000000000", "taxonomy_version": "26.0.215-release-26.0", "time": "2023-05-15T09:53:08.126Z", "type": "raw", "uuid": "b7b515f4-390a-4f87-9865-aafc6b6094ea"}

# Тут будет твой тест. В секции expect укажи сколько и каких корреляционных событий ты ожидаешь
expect 1 {"action": "start", "category.generic": "Attack", "category.high": "Credential Access", "category.low": "OS Credential Dumping", "correlation_name": "Mimikatz", "correlation_type": "incident", "datafield6": "63310a87-d18f-63d3-8410-0d0000000000", "event_src.fqdn": "win10x64-154.testlab.esc", "event_src.host": "win10x64-154.testlab.esc", "event_src.hostname": "win10x64-154", "event_src.subsys": "Microsoft-Windows-Sysmon/Operational", "event_src.title": "sysmon", "event_src.vendor": "microsoft", "importance": "medium", "incident.aggregation.key": "Mimikatz|win10x64-154.testlab.esc|synthetic:vasya@testlab", "incident.aggregation.timeout": 7200, "incident.category": "Undefined", "incident.severity": "medium", "object": "process", "object.account.domain": "testlab", "object.account.id": "synthetic:vasya@testlab", "object.account.name": "vasya", "object.account.session_id": "856196", "object.process.cmdline": "bibikatz.exe  privilege::debug sekurlsa::msv", "object.process.cwd": "C:\\tools\\bibikatz_trunk\\x64\\", "object.process.fullpath": "c:\\tools\\bibikatz_trunk\\x64\\bibikatz.exe", "object.process.guid": "63310a87-0104-6462-5d1f-000000001b00", "object.process.hash.md5": "6EDAEB2D29A6B377A0A02C416E6B00D0", "object.process.hash.sha256": "609B0B3824A99FD78A5E18EDD3461976EB3D7304A2D377210E0F845CDF964D78", "object.process.id": "3700", "object.process.meta": "Description:custom file description | Product:bibikatz | Company:Custom company", "object.process.name": "bibikatz.exe", "object.process.original_name": "bibikatz.exe", "object.process.parent.cmdline": "\"C:\\WINDOWS\\system32\\cmd.exe\"", "object.process.parent.fullpath": "c:\\windows\\system32\\cmd.exe", "object.process.parent.guid": "63310a87-fbe9-6461-8b1e-000000001b00", "object.process.parent.id": "6728", "object.process.parent.name": "cmd.exe", "object.process.parent.path": "c:\\windows\\system32\\", "object.process.path": "c:\\tools\\bibikatz_trunk\\x64\\", "object.process.version": "2.2.0.0", "status": "success", "subject": "account", "subject.account.domain": "testlab", "subject.account.id": "synthetic:vasya@testlab", "subject.account.name": "vasya", "subject.account.privileges": "High", "subject.account.session_id": "856196"}