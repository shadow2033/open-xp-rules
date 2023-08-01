{"action": "start", "body": "{\"Event\":{\"xmlns\":\"http://schemas.microsoft.com/win/2004/08/events/event\",\"System\":{\"Provider\":{\"Name\":\"Microsoft-Windows-Sysmon\",\"Guid\":\"{5770385f-c22a-43e0-bf4c-06f5698ffbd9}\"},\"EventID\":\"1\",\"Version\":\"5\",\"Level\":\"4\",\"Task\":\"1\",\"Opcode\":\"0\",\"Keywords\":\"0x8000000000000000\",\"TimeCreated\":{\"SystemTime\":\"2019-04-30T20:32:51.3248390Z\"},\"EventRecordID\":\"9828\",\"Correlation\":\"\",\"Execution\":{\"ProcessID\":\"1964\",\"ThreadID\":\"1664\"},\"Channel\":\"Microsoft-Windows-Sysmon/Operational\",\"Computer\":\"IEWIN7\",\"Security\":{\"UserID\":\"S-1-5-18\"}},\"EventData\":{\"Data\":[{\"Name\":\"RuleName\"},{\"Name\":\"UtcTime\",\"text\":\"2019-04-30 20:32:51.324\"},{\"Name\":\"ProcessGuid\",\"text\":\"{365abb72-b0f3-5cc8-0000-0010c43a1d00}\"},{\"Name\":\"ProcessId\",\"text\":\"2828\"},{\"Name\":\"Image\",\"text\":\"C:\\\\Windows\\\\System32\\\\cmd.exe\"},{\"Name\":\"FileVersion\",\"text\":\"6.1.7601.17514 (win7sp1_rtm.101119-1850)\"},{\"Name\":\"Description\",\"text\":\"Windows Command Processor\"},{\"Name\":\"Product\",\"text\":\"Microsoft® Windows® Operating System\"},{\"Name\":\"Company\",\"text\":\"Microsoft Corporation\"},{\"Name\":\"CommandLine\",\"text\":\"cmd.exe /Q /c whoami /all 1&gt; \\\\\\\\127.0.0.1\\\\ADMIN$\\\\__1556656369.7 2&gt;&amp;1\"},{\"Name\":\"CurrentDirectory\",\"text\":\"C:\\\\\"},{\"Name\":\"User\",\"text\":\"IEWIN7\\\\IEUser\"},{\"Name\":\"LogonGuid\",\"text\":\"{365abb72-b0f2-5cc8-0000-00203d311d00}\"},{\"Name\":\"LogonId\",\"text\":\"0x1d313d\"},{\"Name\":\"TerminalSessionId\",\"text\":\"0\"},{\"Name\":\"IntegrityLevel\",\"text\":\"High\"},{\"Name\":\"Hashes\",\"text\":\"SHA1=EE8CBF12D87C4D388F09B4F69BED2E91682920B5,MD5=AD7B9C14083B52BC532FBA5948342B98,SHA256=17F746D82695FA9B35493B41859D39D786D32B23A9D2E00F4011DEC7A02402AE,IMPHASH=CEEFB55F764020CC5C5F8F23349AB163\"},{\"Name\":\"ParentProcessGuid\",\"text\":\"{365abb72-b0c0-5cc8-0000-001017c31c00}\"},{\"Name\":\"ParentProcessId\",\"text\":\"836\"},{\"Name\":\"ParentImage\",\"text\":\"C:\\\\Windows\\\\System32\\\\wbem\\\\WmiPrvSE.exe\"},{\"Name\":\"ParentCommandLine\",\"text\":\"C:\\\\Windows\\\\system32\\\\wbem\\\\wmiprvse.exe -secured -Embedding\"}]}}}", "category.generic": "Process", "category.high": "Availability Management", "category.low": "Control", "datafield6": "365abb72-b0f2-5cc8-0000-00203d311d00", "event_src.category": "Other", "event_src.fqdn": "iewin7", "event_src.host": "iewin7", "event_src.hostname": "iewin7", "event_src.subsys": "Microsoft-Windows-Sysmon/Operational", "event_src.title": "sysmon", "event_src.vendor": "microsoft", "generator.type": "logcollector", "generator.version": "N26.0.2936", "id": "PT_Microsoft_Windows_eventlog_Sysmon_1_Process_creation", "importance": "info", "input_id": "00000000-0000-0000-0000-000000000000", "mime": "application/x-pt-eventlog", "msgid": "1", "normalized": true, "object": "process", "object.account.domain": "iewin7", "object.account.id": "synthetic:ieuser@iewin7", "object.account.name": "ieuser", "object.account.privileges": "High", "object.account.session_id": "1913149", "object.process.cmdline": "cmd.exe /Q /c whoami /all 1&gt; \\\\127.0.0.1\\ADMIN$\\__1556656369.7 2&gt;&amp;1", "object.process.cwd": "C:\\", "object.process.fullpath": "c:\\windows\\system32\\cmd.exe", "object.process.guid": "365abb72-b0f3-5cc8-0000-0010c43a1d00", "object.process.hash.imphash": "CEEFB55F764020CC5C5F8F23349AB163", "object.process.hash.md5": "AD7B9C14083B52BC532FBA5948342B98", "object.process.hash.sha1": "EE8CBF12D87C4D388F09B4F69BED2E91682920B5", "object.process.hash.sha256": "17F746D82695FA9B35493B41859D39D786D32B23A9D2E00F4011DEC7A02402AE", "object.process.id": "2828", "object.process.meta": "Description:Windows Command Processor | Product:Microsoft® Windows® Operating System | Company:Microsoft Corporation", "object.process.name": "cmd.exe", "object.process.parent.cmdline": "C:\\Windows\\system32\\wbem\\wmiprvse.exe -secured -Embedding", "object.process.parent.fullpath": "c:\\windows\\system32\\wbem\\wmiprvse.exe", "object.process.parent.guid": "365abb72-b0c0-5cc8-0000-001017c31c00", "object.process.parent.id": "836", "object.process.parent.name": "wmiprvse.exe", "object.process.parent.path": "c:\\windows\\system32\\wbem\\", "object.process.path": "c:\\windows\\system32\\", "object.process.version": "6.1.7601.17514 (win7sp1_rtm.101119-1850)", "recv_ipv4": "127.0.0.1", "recv_time": "2023-06-14T08:42:34.486Z", "status": "success", "subject": "account", "subject.account.domain": "iewin7", "subject.account.id": "synthetic:ieuser@iewin7", "subject.account.name": "ieuser", "subject.account.privileges": "High", "subject.account.session_id": "1913149", "tag": "some_tag", "task_id": "00000000-0000-0000-0000-000000000000", "taxonomy_version": "26.0.215-release-26.0", "time": "2019-04-30T20:32:51.324Z", "type": "raw", "uuid": "96275d9e-aef9-45ba-8e2a-b13766c64ad8"}

expect 1 {"action": "execute", "alert.context": "Executed command: whoami /all via WMIExec", "category.generic": "Attack", "category.high": "Lateral Movement", "category.low": "Remote Services: Distributed Component Object Model", "correlation_name": "Impacket_WMIExec_Command_Executed", "correlation_type": "incident", "datafield1": "whoami /all", "event_src.category": "Other", "event_src.host": "iewin7", "event_src.hostname": "iewin7", "event_src.subsys": "Microsoft-Windows-Sysmon/Operational", "event_src.title": "sysmon", "event_src.vendor": "microsoft", "importance": "high", "incident.aggregation.key": "Impacket_WMIExec_Command_Executed|iewin7|cmd.exe /q /c whoami /all 1&gt; \\\\127.0.0.1\\admin$\\__1556656369.7 2&gt;&amp;1", "incident.aggregation.timeout": 600, "incident.category": "Undefined", "incident.severity": "high", "object": "command", "object.account.domain": "iewin7", "object.account.id": "synthetic:ieuser@iewin7", "object.account.name": "ieuser", "object.account.privileges": "High", "object.account.session_id": "1913149", "object.process.cmdline": "cmd.exe /Q /c whoami /all 1&gt; \\\\127.0.0.1\\ADMIN$\\__1556656369.7 2&gt;&amp;1", "object.process.cwd": "C:\\", "object.process.fullpath": "c:\\windows\\system32\\cmd.exe", "object.process.guid": "365abb72-b0f3-5cc8-0000-0010c43a1d00", "object.process.hash.md5": "AD7B9C14083B52BC532FBA5948342B98", "object.process.hash.sha1": "EE8CBF12D87C4D388F09B4F69BED2E91682920B5", "object.process.hash.sha256": "17F746D82695FA9B35493B41859D39D786D32B23A9D2E00F4011DEC7A02402AE", "object.process.id": "2828", "object.process.meta": "Description:Windows Command Processor | Product:Microsoft® Windows® Operating System | Company:Microsoft Corporation", "object.process.name": "cmd.exe", "object.process.parent.cmdline": "C:\\Windows\\system32\\wbem\\wmiprvse.exe -secured -Embedding", "object.process.parent.fullpath": "c:\\windows\\system32\\wbem\\wmiprvse.exe", "object.process.parent.id": "836", "object.process.parent.name": "wmiprvse.exe", "object.process.parent.path": "c:\\windows\\system32\\wbem\\", "object.process.path": "c:\\windows\\system32\\", "object.process.version": "6.1.7601.17514 (win7sp1_rtm.101119-1850)", "status": "success", "subject": "account", "subject.account.domain": "iewin7", "subject.account.id": "synthetic:ieuser@iewin7", "subject.account.name": "ieuser", "subject.account.privileges": "High", "subject.account.session_id": "1913149"}